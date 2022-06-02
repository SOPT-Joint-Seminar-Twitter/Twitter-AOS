# Twitter-AOS

<details>
  <summary><b>gif</b></summary>
<div markdown="1">

  <br><br>

💫서버통신 완료💫
<br>
![ezgif com-gif-maker (6)](https://user-images.githubusercontent.com/69586104/171723397-1649751e-25fd-4780-b91b-677c94e56f29.gif)

<br><br>

|진실(홈)|원용(글쓰기)|혜빈(홈&글쓰기)|
|---|---|---|
|![ezgif com-gif-maker (3)](https://user-images.githubusercontent.com/69586104/169655780-f58f61c1-1586-42ea-859b-f942cff9114f.gif)|![ezgif com-gif-maker (4)](https://user-images.githubusercontent.com/69586104/169655783-907ea9a5-98d9-4d23-9f65-1a6889d1413c.gif)|![ezgif com-gif-maker (2)](https://user-images.githubusercontent.com/69586104/169655784-aecc7683-8cd1-4d80-ada6-3cdec628c311.gif)|



</details>
</div>

<details>
  <summary><b>Twitter Android Developer</b></summary>
<div markdown="1">
  😎파트장님! 혜빈 코드는 develop branch / 원용, 진실 코드는 main branch에서 확인 가능합니당
  <br>
<table align="center" style = "table-layout: auto; width: 100%; table-layout: fixed;">
  <colgroup>
    <col style="width:33%"/>
    <col style="width:34%"/>
    <col style="width:33%"/>
  </colgroup>

  <tr>
    <th align="center">이혜빈</th>
    <th align="center">강원용</th>
    <th align="center">우진실</th>
  </tr>
  <tr>
    <td align="center">
     홈, 글쓰기
    </td>
    <td align="center">
     글쓰기
    </td>
    <td align="center">
     홈
    </td>
  </tr>
</table>

</details>
</div>

<details>
  <summary><b>Git Branch Convention</b></summary>
<div markdown="1">

* **Git Branch Convention**

  1. branch 이름은 snake_case 표기법 사용
  2. "feat/issue번호-이름" 으로 통일 ex) feat/1-main-activity

  * default branch: main
  * main에서 본인이 작업할 branch 생성
  * 작업 완료시 본인이 작업한 branch push 후 main으로 merge
  * merge 후 새로운 issue 생성(다음 작업에 대한 issue 생성)
  * 위 3개 과정 반복

* **Git Commit Message Convention**

  * 기본 구조

    ```
    [TYPE] #{issue_number} - subject
    body(선택사항)
    footer(선택사항)
    ```

    * issue 생성 시 부여된 issue 번호를 가지고 commit
    * issue 번호를 커밋 메시지에 위와 같이 적어주면 어떤 issue를 처리하는 작업이었는지 조회하기 쉬움

  * 예시

    ```
    // 하나의 issue 처리 및 commit
    [FEAT] #1 - MainActivity BottomNavigation 구현
    ```

    ```
    // 여러 issue 처리 및 commit
    [REFACTOR] : ReFactor Code From OtherPage
    - OtherPage : 답변하지 않은 답변도 볼 수 있도록 수정
    - OtherPage : 답변하지 않은 답변도 스크랩할 수 있도록 수정
    - modified file : OtherPageAdapter, OtherPageActivity, OtherPageViewModel, item_other_page
    issue track : #610, #612
    ```

* **Issue Number**

  * 이슈 단위 커밋으로 기능 개발을 관리함
  * Github 상에서 issue를 tracking 할 수 있게 issue 번호를 commit message에 넣음

* **Type**

  * FEAT: 새로운 기능 개발(kotlin)
  * UI: 스타일 코드 변경(xml)
  * FIX: 버그 수정
  * MODIFY: 코드 수정(kotlin)
  * CHORE: Gradle, Setting 설정
  * DOCS: 문서 수정(README.md)

* **Subject**

  * Subject는 50자 이내로 작성
  * 첫 글자는 대문자
  * 마침표(.) 찍지 않기
  * 작업 내용 명시
  * 명령조로 작성(Fixed(x), Modified(x) -> Fix(o), Modify(o))

* **Body**

  * Subject(commit 제목) 이외 부연 설명이 필요하거나 여러 issue를 한꺼번에 commit할 때 사용

  * Subject를 작성하고 엔터를 치면 다음 줄로 넘어가고 추가로 설명을 적을 수 있음

    ```
    git commit -m "[TYPE] #{issue_number} - Subject(엔터)
    Body(부연설명)"
    ```

* **Footer**

  * 처리한 issue 번호를 적을 때 사용

    ```
    #{issue_number} [TYPE] : subject
    - body(이슈1)
    - body(이슈2)
    - body(이슈3)
    issue track : #이슈1번호, #이슈2번호, #이슈3번호
    ```
  </div>
</details>
<details>
  <summary><b>Code Convention</b></summary>
<div markdown="1">


* 모든 이름은 어떤 역할을 하는지 한 눈에 알 수 있도록 한다.
* id는 중복을 막기 위해 어떤 Activity(Fragment)에서 사용 중인지 명시한다.

1. **Class file - UpperCamelCase**

   * 클래스 파일 이름은 **UpperCamelCase**로 작성

   * 전체 이름의 첫 문자를 포함한 각 단어의 첫 문자를 대문자로 표시

     ex) MainActivity, FeedFragment, CommentAdapter, etc

2. **Resource file - snake_case**

   * 리소스 파일 이름은 **snake_case**로 작성

   * 모든 단어는 소문자로, 각 단어의 구분은 언더바(_)로 표시

     ex) image_main.png, menu_main.xml, etc

3. **Layout file - snake_case**

   * 레이아웃 파일 이름 또한 **snake_case**로 작성

   * [what]_[where]

     ex) MainActivity.kt -> activity_main.xml / FeedFragment.kt -> fragment_feed.xml

   * xml 파일의 id명은 [what] _ [where] _ []

     ex) MainActivity에서 사용되는 name을 표시하는 textview -> textview_main_name

   * prifix

     Button, ImageButton -> btn / TextView -> tv_ / ImageView -> iv_ / EditText -> et_
  <br>
     ConstraintLayout -> cl_ / LinerLayout -> ll_ / BottomNavigationView -> bnv_

4. **Method - lowerCamelCase**

   * 메서드 이름은 **lowerCamelCase**로 작성

   * 전체 이름의 첫 문자를 소문자로, 나머지 각 단어의 첫 문자는 대문자로 표시

   * 동사로 시작하는 형태를 사용하되, 동사 원형만 사용

     ex) getUserInfo, showList

   * 한 단어 내에서는 대소문자 미변경

   * 약어 사전에 있는 단어는 되도록 약어 사용

   * 자주 사용하는 동사는 용법에 맞게 사용

     * **show**: Invisible한 것을 Visible하게 바꾸는 동작
     * **check**: 어떤 것을 확인한 후 boolean 혹은 value로 반환하는 동작
     * **is**: 어떤 것인지 확인한 후 boolean으로 반환하는 동작
     * **has**: 어떤 것을 가지고 있는지 확인한 후 boolean으로 반환하는 동작

5. **String - snake_case**

   * string 이름은 **snake_case**로 작성
   * id명은 [where] _ []
   * 자주 쓰일 것 같은 string 같은 경우는 string _ [] : conflict 최소화를 위해 사용 전, 검색 후 사용

6. **variable / value - lowerCamelCase**

   * 변수 이름은 **lowerCamelCase**로 작성
   * 전체 이름의 첫 문자를 소문자로, 나머지 각 단어의 첫 문자는 대문자로 표시


    </div>
</details>
<details>
  <summary><b>Packaging</b></summary>
<div markdown="1">

```
🐥Twitter - Main Branch (원용 & 진실 개발)🐥
  ┣ 📂ui
   ┣ 📂base
     ┣ 📂BaseActivity
     ┗ 📂BaseFragment
   ┣ 📂data
     ┣ 📂request
       ┗ 📂RequestWriteTwit
     ┣ 📂response
       ┣ 📂ResponseHeart
       ┣ 📂ResponseTwitList
       ┗ 📂ResponseUserInfoData
     ┣ 📂write
       ┣ 📂WriteRepository
       ┗ 📂WriteRequest
     ┣ 📂ApiService
     ┣ 📂ResponseType
     ┣ 📂REtrofitBuilder
     ┗ 📂WrapperClass
   ┣ 📂main
     ┣ 📂FanccyFragment
     ┣ 📂HomeActivity
     ┣ 📂InfoFragment
     ┣ 📂MediaFragment
     ┣ 📂ReplyFragment
     ┣ 📂TabViewPaterAdapter
     ┣ 📂TwitAdapter
     ┣ 📂TwitData
     ┗ 📂TwitFragment
   ┣ 📂write
     ┣ 📂WriteActivity
     ┣ 📂WriteAdatper
     ┗ 📂WriteViewModel
   ┗ 📂util
     ┗ 📂BindingAdapter
  ┗📂App


🐥Twitter - Develop Branch (혜빈 개발)🐥
  ┣ 📂data
   ┣ 📂api
     ┣ 📂ApiService
     ┗ 📂ServiceCreator
   ┣ 📂request
     ┗ 📂RequestWriteTwit
   ┗ 📂reponse
     ┣ 📂ResponseLike
     ┣ 📂ResponseTwitList
     ┣ 📂ResponseUserInfoData
     ┗ 📂ResponseWriteTwit
    ┣ 📂TwitData
    ┗ 📂WriteData
  ┣ 📂ui
   ┣ 📂base
     ┣ 📂BaseActivity
     ┗ 📂BaseFragment
   ┣ 📂main
     ┣ 📂adapter
      ┣ 📂HomeTabAdapter
      ┗ 📂TwitAdapter
     ┣ 📂viewmodel
      ┗ 📂HomeViewModel
     ┣ 📂HomeActivity
     ┣ 📂InfoFragment
     ┣ 📂MediaFragment
     ┣ 📂MindFragment
     ┣ 📂ReplyFragment
     ┗ 📂TwitFragment
   ┣ 📂write
     ┣ 📂adapter
      ┗ 📂WriteAdatper
     ┣ 📂viewmodel
      ┗ 📂WriteViewModel
     ┗ 📂WriteActivity
   ┗ 📂util
     ┗ 📂BindingAdapter
```
  </div>
</details>
