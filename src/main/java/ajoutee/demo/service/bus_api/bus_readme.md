# readme

## 서울시 교통정보과 openAPI 기본 정보

[https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15000303](https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15000303)

- **이름** : 서울특별시_정류소정보조회 서비스
- **요청주소 서비스URL :** http://ws.bus.go.kr/api/rest/stationinfo
- **신청가능 트래픽**
    - 개발계정 : 1,000 회
    - 운영계정 : 활용사례 등록시 신청하면 트래픽 증가 가능
- **API 유형** : REST
- **데이터 포멧** : JSON + XML
- **비용** : 무료
- **심의유형**
    - 개발단계 : 자동승인
    - 운영단계 : 자동승인

## ****정류소 고유번호와 노선id를 입력받아 첫차/막차 예정시간을 조회****

### ****요청변수(Request Parameter)****

**서비스URL :** http://ws.bus.go.kr/api/rest/stationinfo/getBustimeByStation

| 항목명(국문) | 항목명(영문) | 항목크기 | 항목구분 | 샘플데이터 | 항목설명 |
| --- | --- | --- | --- | --- | --- |
| 정류소 고유번호 | arsId | 5 | 필수 | 01001 | 정류소 번호 |
| 노선ID | busRouteId | 9 | 필수 | 100000001 | 노선ID |

*샘플 데이터 :* [https://data.seoul.go.kr/dataList/OA-15067/S/1/datasetView.do](https://data.seoul.go.kr/dataList/OA-15067/S/1/datasetView.do)

### ****출력결과(Response Element)****

| 항목명(국문) | 항목명(영문) | 항목크기 | 항목구분 | 샘플데이터 | 항목설명 |
| --- | --- | --- | --- | --- | --- |
|  | MsgBody |  | 옵션 |  |  |
|  | RouteList | 112 | 옵션 |  | List형 |
| 정류소고유번호 | arsId | 5 | 필수 |  | 정류소 번호 |
| 정류소명 | stationNm | 60 | 필수 |  | 정류소명 |
| 노선ID | busRouteId | 9 | 필수 |  | 노선ID |
| 노선명 | busRouteNm | 30 | 필수 |  | 노선명 |
| 금일첫차시간 | firstBusTm | 22 | 필수 |  | 금일첫차시간 |
| 금일막차시간 | lastBusTm | 22 | 필수 |  | 금일막차시간 |

현재 인증 key가 서버 상에 반영되지 않아서 인증 문제가 발생 중. 처리 상태는 승인이지만, 반영되기까지는 시간이 더 필요하다고 함.

```jsx
// 현재 발생 중인 문제
<headerMsg>Key인증실패: SERVICE KEY IS NOT REGISTERED ERROR.[인증모듈 에러코드(30)]</headerMsg>
```