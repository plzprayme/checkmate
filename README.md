# CheckMate
체크 메이트와 함께 깜빡하기 쉬운 일들을 체크해보세요!!
체크 메이트에게 `오늘 영양제 먹었나?` 라고 물어보세요! 체크 메이트가 알려드릴게요!!

## Interaction Model

## Slot

### Custom Slot

- CHECK
    
    안한일: 안한것
    
    남은일: 남은거, 남은것
    
- ACTION
    
    등록: 신청
    
    확인: 점검
    
    섭취: 복용
    
    마무리: 마감
    
    완성: 완료, 완성
    
- LEFT_OVER_TODO
    
    해야할일: 할일, 할거, 할것
    
    안한거: 안한일, 안한것
    
    남은거: 남은일, 남은것
    
- TODO
    
    오메가쓰리: 오메가3
    
    숙제: 과제
    
    유산균: 프로바이오틱스
    
    비타민: 멀티비타민, 종합비타민
    
    영양제
    

### Built-in Slot

- CLOVA.DATETIME
- CLOVA.DURATION
- CLOVA.RELATIVETIME

## Intent

### Custom Intent

|   | TODO Slot | ACTION Slot | REMOVE Intent|
|---|-----------|------|-------------|
| 1 |영양제	| 확인 |	취소해줘|
| 2 |비타민 |	복용 |	그만할래 |
| 3 |유산균	|확인|	없애줘|
| 4 |과제	|마무리|	안할래|
| 5 |오메가쓰리	|섭취|	제거해줘|

|   | DURATION Slot | CHECK Slot | CHECK Intent|
|---|-----------|------|-------------|
| 1 |        | 안한거      | 있어?         |
| 2 | 아직    | 남은일   | 있어?         |
| 3 | 오늘       | 안한일   | 있어?             |

|   | TODO Slot | None | ACTION Slot | Add Intent |
|---|-----------|------|-------------|------------|
| 1 | 숙제       |      | 마감         | 할게    |
| 2 | 비타민    | 섭취   |         | 해야돼        |
| 3 | 영양제       | 먹기   |             | 해보자        |
| 4 | 오메가쓰리     |      | 복용          | 추가해줘      |

### Built-in Intent

Clova.GuideIntent: 도움말 요청 “너 뭐 할 줄 알아?”, “사용법 알려줘”

Clova.YesIntnt: 긍정 응답 “응”, “그래”, “알겠어”, “오케이”

Clocal.StopIntent, Clova.NoIntent, Clova.PuaseIntent 말하던거 중지

Clova.ResumeIntent “다시 들려줘”