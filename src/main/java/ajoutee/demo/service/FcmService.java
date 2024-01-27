package ajoutee.demo.service;

import ajoutee.demo.repository.LastTimeRepository;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FcmService {

    static int num;

    public String CRON_NUM = convert60(num);

    private final LastTimeRepository lastTimeRepository;

    // 비밀키 경로 환경 변수 ( 필수 )
    @Value("${fcm.service-account-file}")
    private String serviceAccountFilePath;

    // topic 이름 환경 변수
    @Value("${fcm.topic-name}")
    private String topicName;

    // 프로젝트 아이디 환경 변수 ( 필수 )
    @Value("${fcm.project-id}")
    private String projectId;


    // 의존성 주입이 이루어진 후 초기화를 수행한다.
    @PostConstruct
    public void initialize() throws IOException {
        //Firebase 프로젝트 정보를 FireBaseOptions에 입력해준다.
        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(new ClassPathResource(serviceAccountFilePath).getInputStream()))
                .setProjectId(projectId)
                .build();

        //입력한 정보를 이용하여 initialze 해준다.
        FirebaseApp.initializeApp(options);
    }

    public int timeSearch(String station) {
        List<Integer> lastTimes = lastTimeRepository.searchLastTime(station);
        Integer num = lastTimes.get(0);

        return num; //  2351
    }

//    @Scheduled(cron = "${CRON_NUM}")
//    public void pushLastTimeAlarm() throws FirebaseMessagingException{
//        log.info("막차 시간 알림");
//        log.info("CRON 넘버 : " + CRON_NUM);
//        sendMessageByTopic("막차","막차까지 15분남았습니다.");
//    }

    @Scheduled(cron = "0/30 * * * * *")
    public void pushLastTimeAlarm() throws FirebaseMessagingException{
        log.info("막차 시간 알림");
        sendMessageByTopic("막차","막차까지 15분남았습니다.");
    }

    // 해당 지정된 topic에 fcm를 보내는 메서드
    public void sendMessageByTopic(String title, String body) throws FirebaseMessagingException {
        FirebaseMessaging.getInstance().send(Message.builder()
                .setNotification(Notification.builder()
                        .setTitle(title)
                        .setBody(body)
                        .build())
                .setTopic(topicName)
                .build());
    }
    // 받은 token을 이용하여 fcm를 보내는 메서드
    public void sendMessageByToken(String title, String body,String token) throws FirebaseMessagingException{
        FirebaseMessaging.getInstance().send(Message.builder()
                .setNotification(Notification.builder()
                        .setTitle(title)
                        .setBody(body)
                        .build())
                .setToken(token)
                .build());
    }

    public static String convert60(int num){

        int ltEnum2 = 0;

        //23:00 -> 22:85

        ltEnum2 = num-15;

        if(ltEnum2%100 > 60){
            ltEnum2 = ltEnum2-40;
        }

        String convert = Integer.toString(ltEnum2);
        String fT = convert.substring(0,1);
        String lT = convert.substring(2,3);


        String convertTime = "*" + lT + fT + "*" + "*" + "*";

        return convertTime;
    }

//    @Value("${CRON_NUM}")
//    public void setCron(String cron){
//        this.CRON_NUM = cron;
//    }


}



