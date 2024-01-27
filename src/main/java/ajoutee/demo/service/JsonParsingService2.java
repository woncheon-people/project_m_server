package ajoutee.demo.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@Service
@NoArgsConstructor
public class JsonParsingService2 {

    public String parseJSON2(String frCode, String weekTag, String inoutTag) throws IOException {

        String key = "4d5771686d7979623736415a714743";

        //파싱할 데이터를 저장할 변수
        String bfResult = "";
        String brResult = "";
        StringBuilder sb = new StringBuilder();

        try{
            URL url = new URL("http://openAPI.seoul.go.kr:8088/" + key + "/json/SearchLastTrainTimeByFRCodeService/1/5/"
            + frCode + "/" + weekTag + "/" + inoutTag);

            System.out.println(url);

//            URL url = new URL("http://openAPI.seoul.go.kr:8088/4d5771686d7979623736415a714743/xml/SearchLastTrainTimeByFRCodeService/1/5/352/1/1/");

            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));


            while((brResult = br.readLine())!=null){
                sb.append(brResult);
                System.out.println(brResult);
            }

            br.close();
            con.disconnect();
        }catch (Exception e){
            e.printStackTrace();
        }

        return sb.toString();

    }
}
