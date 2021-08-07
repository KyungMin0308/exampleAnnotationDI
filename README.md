# exampleAnnotationDI

### **1. Description**
* **Annotation 기반**의 의존성 주입(Dependency Injection) 예제 프로그램입니다.


### **2. Environment**
* **Eclispe**
  + Maven Project(Create a single project(skip archetype selection))
* **Tomcat 9.0**


### **3. Packages**
* **main**
  + 의존성 주입을 위한 예제 코드들
  + **AnimalType** : 인터페이스
  + **Cat, Dog** : AnimalType을 구현한 클래스
  + **PetOwner** : AnimalType 의존성 주입을 위한 클래스(**@Autowired**, **@Qualifier**)
  + **MainApp**
* **conf**
  + Spring Container를 위한 설정 파일
  + **animal.xml** : Bean 생성
    - <**<context:annotation-config>**> 태그 : Annotation 기능 활성화


### **4. Files**
* **pom.xml**
  + spring-context
  + lombok
