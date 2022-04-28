# 💎2022년 1학기 스터디상생 프로젝트💎
<br>

## 🐱프로젝트 참여자🐱

|학과|이름|직책|책임|
|---|---|---|---|
|생활예술학과|김성은|팀장|* 경영 관리자<br>* 어플리케이션 디자이너|
|컴퓨터과학과|장혜원|클라이언트 책임자|* 클라이언트 개발 책임|
|휴먼지능정보공학과|유동선|백엔드 책임자|* 백엔드 개발 책임|
|지능데이터학부|우아안|데이터 분석가|* 데이터 분석 업무 담당|
||||
|휴먼지능정보공학과|임좌상|지도교수||
<br>
<br>

## 🔸프로젝트 목적🔸
* 대학생을 위한 간단한 영어학습 단어장 DApp
<br>
<br>

## 🔸프로젝트 소개🔸
* 기존 단어장은 학습을 중심으로 특정 시험을 준비하기 위해 디자인되어 있음<br>
이로 인해 소수의 ‘열공’하는 인원들을 제외한 인원들은 학습을 유지하지 못하는 상황이 발생함. 
* 이 프로젝트의 목적은 작지만 꾸준한 학습 동기부여를 제공하는 것. 
* SNS에서 영감을 받아 등하교길 대중교통에서 SNS를 잠깐 보듯 <br>
시간을 내서 실행할 수 있는 소량의 단어들을 매일 제공하는 앱을 만드는 것이 프로젝트의 목적. 
* 학습 동기부여를 위한 방법은 두 가지
  * 첫째는 SNS 기능의 추가. <br>대중교통에서 SNS를 켜 남들의 게시글에 댓글과 좋아요를 다는 것 처럼<br> 타인의 단어장에 좋아요와 댓글을 
달고 남들도 나에게 반응할 수 있는 기능을 추가하여 사회적인 만족감을 통한 동기부여
를 제공. 
  * 둘째는 DApp기능을 통한 화폐 보상. 회원가입시 가상화폐 플랫폼에 계정을 생성. <br>이후 연속적으로 출석할 경우 일수에 비례한 화폐 보상을 제공해 물질적인 만족감을 통한 동기부여를 기대.
<br>
<br>

## 🔸프로젝트 내용 및 방법🔸
|파트|도구|산출물|비고|
|---|---|-----|---|
|디자인|Adobe XD|UI/UX프로토타이핑|
|클라이언트|Android Studio|클라이언트 코드|Java|
|백엔드|NodeJs|백엔드 코드|Javascript|
|클라우드 서버|AWS-Ubunut||Ubuntu 20.04.3 LTS|
|데이터 분석|Mysql Workbench|정제 데이터|Mysql|

<br>
<br>

## 🔸일정 명세🔸
|차시|일정|내용|
|---|---|---|
|1|프로젝트 목적 명세|회의를 통한 팀원 개개인에 대한 이해도 향상 이를 바탕으로 각자의 직무를 구체화.<br> 프로젝트 제안서를 기반으로 프로젝트의 목적과 방향성을 명세|
|2|프로젝트 요구사항 분석|실패하지 않는 프로젝트 진행을 위해 프로젝트에 요구되는 요구사항을 분석.<br> 이를 일정 분석 차트를 통해 도식화하여 작업 단위를 세분화함.|
|3|UI/UX 프로토타이핑|작성된 요구사항 명세서를 바탕으로. 만들어 낼 앱에 대한 UI/UX프로토타이핑을 구현.|
|4|클라이언트 구현_1|1. 자바 기반 안드로이드 클라이언트 기능을 구현함. 블록체인과 연관되지 않은 안드로이드 네이티브한 기능만을 구현<br>2. 작성된 UI/UX프로토타이핑을 기반으로 안드로이드 앱 UI를 작성<br>3. 단어장 DB를 앱 안에 사용될 수 있는 수준의 데이터베이스로 정제|
|5|클라이언트 구현_2|1. 자바 기반 안드로이드 클라이언트 기능을 구현함. 블록체인과 연관된 기능을 클라이언트 라이브러리를 통해 이더리움 네트워크와 연결함.<br>2. 안드로이드 앱 UI를 클라이언트 소스와 연동<br>3. 정제된 단어장 DB를 데이터 분석을 통해 불필요한 단어 제거|
|6|백엔드 구현_1|1. NodeJs를 이용한 백엔드 기능을 구현. 블록체인과 연관되지 않은 SQL을 사용하는 중앙집중형 서버 기능을 구현함<br>2. 제작된 백엔드 코드와 클라이언트 코드의 연동<br>3. 데이터베이스 유지보수 절차|
|7|백엔드 구현_2|1. NodeJs를 이용한 백엔드 기능을 구현. 블록체인과 연관된 기능 관련 분산 서버 기능을 구현.<br>2. 제작된 백엔드 코드(블록체인 연동)과 클라이언트 코드의 연동|
|8|테스팅|완성된 결과물에 대한 테스팅과 수정을 통해 버그를 최소화|
|9|릴리즈|최종 릴리즈 버전을 구글 플레이스토어에 배포|
