# Twitter-AOS

<details>
  <summary><b>gif</b></summary>
<div markdown="1">

  <br><br>

๐ซ์๋ฒํต์  ์๋ฃ๐ซ
<br>
![ezgif com-gif-maker (6)](https://user-images.githubusercontent.com/69586104/171723397-1649751e-25fd-4780-b91b-677c94e56f29.gif)

<br><br>

|์ง์ค(ํ)|์์ฉ(๊ธ์ฐ๊ธฐ)|ํ๋น(ํ&๊ธ์ฐ๊ธฐ)|
|---|---|---|
|![ezgif com-gif-maker (3)](https://user-images.githubusercontent.com/69586104/169655780-f58f61c1-1586-42ea-859b-f942cff9114f.gif)|![ezgif com-gif-maker (4)](https://user-images.githubusercontent.com/69586104/169655783-907ea9a5-98d9-4d23-9f65-1a6889d1413c.gif)|![ezgif com-gif-maker (2)](https://user-images.githubusercontent.com/69586104/169655784-aecc7683-8cd1-4d80-ada6-3cdec628c311.gif)|



</details>
</div>

<details>
  <summary><b>Twitter Android Developer</b></summary>
<div markdown="1">
  ๐ํํธ์ฅ๋! ํ๋น ์ฝ๋๋ develop branch / ์์ฉ, ์ง์ค ์ฝ๋๋ main branch์์ ํ์ธ ๊ฐ๋ฅํฉ๋๋น
  <br>
<table align="center" style = "table-layout: auto; width: 100%; table-layout: fixed;">
  <colgroup>
    <col style="width:33%"/>
    <col style="width:34%"/>
    <col style="width:33%"/>
  </colgroup>

  <tr>
    <th align="center">์ดํ๋น</th>
    <th align="center">๊ฐ์์ฉ</th>
    <th align="center">์ฐ์ง์ค</th>
  </tr>
  <tr>
    <td align="center">
     ํ, ๊ธ์ฐ๊ธฐ
    </td>
    <td align="center">
     ๊ธ์ฐ๊ธฐ
    </td>
    <td align="center">
     ํ
    </td>
  </tr>
</table>

</details>
</div>

<details>
  <summary><b>Git Branch Convention</b></summary>
<div markdown="1">

* **Git Branch Convention**

  1. branch ์ด๋ฆ์ snake_case ํ๊ธฐ๋ฒ ์ฌ์ฉ
  2. "feat/issue๋ฒํธ-์ด๋ฆ" ์ผ๋ก ํต์ผ ex) feat/1-main-activity

  * default branch: main
  * main์์ ๋ณธ์ธ์ด ์์ํ  branch ์์ฑ
  * ์์ ์๋ฃ์ ๋ณธ์ธ์ด ์์ํ branch push ํ main์ผ๋ก merge
  * merge ํ ์๋ก์ด issue ์์ฑ(๋ค์ ์์์ ๋ํ issue ์์ฑ)
  * ์ 3๊ฐ ๊ณผ์  ๋ฐ๋ณต

* **Git Commit Message Convention**

  * ๊ธฐ๋ณธ ๊ตฌ์กฐ

    ```
    [TYPE] #{issue_number} - subject
    body(์ ํ์ฌํญ)
    footer(์ ํ์ฌํญ)
    ```

    * issue ์์ฑ ์ ๋ถ์ฌ๋ issue ๋ฒํธ๋ฅผ ๊ฐ์ง๊ณ  commit
    * issue ๋ฒํธ๋ฅผ ์ปค๋ฐ ๋ฉ์์ง์ ์์ ๊ฐ์ด ์ ์ด์ฃผ๋ฉด ์ด๋ค issue๋ฅผ ์ฒ๋ฆฌํ๋ ์์์ด์๋์ง ์กฐํํ๊ธฐ ์ฌ์

  * ์์

    ```
    // ํ๋์ issue ์ฒ๋ฆฌ ๋ฐ commit
    [FEAT] #1 - MainActivity BottomNavigation ๊ตฌํ
    ```

    ```
    // ์ฌ๋ฌ issue ์ฒ๋ฆฌ ๋ฐ commit
    [REFACTOR] : ReFactor Code From OtherPage
    - OtherPage : ๋ต๋ณํ์ง ์์ ๋ต๋ณ๋ ๋ณผ ์ ์๋๋ก ์์ 
    - OtherPage : ๋ต๋ณํ์ง ์์ ๋ต๋ณ๋ ์คํฌ๋ฉํ  ์ ์๋๋ก ์์ 
    - modified file : OtherPageAdapter, OtherPageActivity, OtherPageViewModel, item_other_page
    issue track : #610, #612
    ```

* **Issue Number**

  * ์ด์ ๋จ์ ์ปค๋ฐ์ผ๋ก ๊ธฐ๋ฅ ๊ฐ๋ฐ์ ๊ด๋ฆฌํจ
  * Github ์์์ issue๋ฅผ tracking ํ  ์ ์๊ฒ issue ๋ฒํธ๋ฅผ commit message์ ๋ฃ์

* **Type**

  * FEAT: ์๋ก์ด ๊ธฐ๋ฅ ๊ฐ๋ฐ(kotlin)
  * UI: ์คํ์ผ ์ฝ๋ ๋ณ๊ฒฝ(xml)
  * FIX: ๋ฒ๊ทธ ์์ 
  * MODIFY: ์ฝ๋ ์์ (kotlin)
  * CHORE: Gradle, Setting ์ค์ 
  * DOCS: ๋ฌธ์ ์์ (README.md)

* **Subject**

  * Subject๋ 50์ ์ด๋ด๋ก ์์ฑ
  * ์ฒซ ๊ธ์๋ ๋๋ฌธ์
  * ๋ง์นจํ(.) ์ฐ์ง ์๊ธฐ
  * ์์ ๋ด์ฉ ๋ช์
  * ๋ช๋ น์กฐ๋ก ์์ฑ(Fixed(x), Modified(x) -> Fix(o), Modify(o))

* **Body**

  * Subject(commit ์ ๋ชฉ) ์ด์ธ ๋ถ์ฐ ์ค๋ช์ด ํ์ํ๊ฑฐ๋ ์ฌ๋ฌ issue๋ฅผ ํ๊บผ๋ฒ์ commitํ  ๋ ์ฌ์ฉ

  * Subject๋ฅผ ์์ฑํ๊ณ  ์ํฐ๋ฅผ ์น๋ฉด ๋ค์ ์ค๋ก ๋์ด๊ฐ๊ณ  ์ถ๊ฐ๋ก ์ค๋ช์ ์ ์ ์ ์์

    ```
    git commit -m "[TYPE] #{issue_number} - Subject(์ํฐ)
    Body(๋ถ์ฐ์ค๋ช)"
    ```

* **Footer**

  * ์ฒ๋ฆฌํ issue ๋ฒํธ๋ฅผ ์ ์ ๋ ์ฌ์ฉ

    ```
    #{issue_number} [TYPE] : subject
    - body(์ด์1)
    - body(์ด์2)
    - body(์ด์3)
    issue track : #์ด์1๋ฒํธ, #์ด์2๋ฒํธ, #์ด์3๋ฒํธ
    ```
  </div>
</details>
<details>
  <summary><b>Code Convention</b></summary>
<div markdown="1">


* ๋ชจ๋  ์ด๋ฆ์ ์ด๋ค ์ญํ ์ ํ๋์ง ํ ๋์ ์ ์ ์๋๋ก ํ๋ค.
* id๋ ์ค๋ณต์ ๋ง๊ธฐ ์ํด ์ด๋ค Activity(Fragment)์์ ์ฌ์ฉ ์ค์ธ์ง ๋ช์ํ๋ค.

1. **Class file - UpperCamelCase**

   * ํด๋์ค ํ์ผ ์ด๋ฆ์ **UpperCamelCase**๋ก ์์ฑ

   * ์ ์ฒด ์ด๋ฆ์ ์ฒซ ๋ฌธ์๋ฅผ ํฌํจํ ๊ฐ ๋จ์ด์ ์ฒซ ๋ฌธ์๋ฅผ ๋๋ฌธ์๋ก ํ์

     ex) MainActivity, FeedFragment, CommentAdapter, etc

2. **Resource file - snake_case**

   * ๋ฆฌ์์ค ํ์ผ ์ด๋ฆ์ **snake_case**๋ก ์์ฑ

   * ๋ชจ๋  ๋จ์ด๋ ์๋ฌธ์๋ก, ๊ฐ ๋จ์ด์ ๊ตฌ๋ถ์ ์ธ๋๋ฐ(_)๋ก ํ์

     ex) image_main.png, menu_main.xml, etc

3. **Layout file - snake_case**

   * ๋ ์ด์์ ํ์ผ ์ด๋ฆ ๋ํ **snake_case**๋ก ์์ฑ

   * [what]_[where]

     ex) MainActivity.kt -> activity_main.xml / FeedFragment.kt -> fragment_feed.xml

   * xml ํ์ผ์ id๋ช์ [what] _ [where] _ []

     ex) MainActivity์์ ์ฌ์ฉ๋๋ name์ ํ์ํ๋ textview -> textview_main_name

   * prifix

     Button, ImageButton -> btn / TextView -> tv_ / ImageView -> iv_ / EditText -> et_
  <br>
     ConstraintLayout -> cl_ / LinerLayout -> ll_ / BottomNavigationView -> bnv_

4. **Method - lowerCamelCase**

   * ๋ฉ์๋ ์ด๋ฆ์ **lowerCamelCase**๋ก ์์ฑ

   * ์ ์ฒด ์ด๋ฆ์ ์ฒซ ๋ฌธ์๋ฅผ ์๋ฌธ์๋ก, ๋๋จธ์ง ๊ฐ ๋จ์ด์ ์ฒซ ๋ฌธ์๋ ๋๋ฌธ์๋ก ํ์

   * ๋์ฌ๋ก ์์ํ๋ ํํ๋ฅผ ์ฌ์ฉํ๋, ๋์ฌ ์ํ๋ง ์ฌ์ฉ

     ex) getUserInfo, showList

   * ํ ๋จ์ด ๋ด์์๋ ๋์๋ฌธ์ ๋ฏธ๋ณ๊ฒฝ

   * ์ฝ์ด ์ฌ์ ์ ์๋ ๋จ์ด๋ ๋๋๋ก ์ฝ์ด ์ฌ์ฉ

   * ์์ฃผ ์ฌ์ฉํ๋ ๋์ฌ๋ ์ฉ๋ฒ์ ๋ง๊ฒ ์ฌ์ฉ

     * **show**: Invisibleํ ๊ฒ์ Visibleํ๊ฒ ๋ฐ๊พธ๋ ๋์
     * **check**: ์ด๋ค ๊ฒ์ ํ์ธํ ํ boolean ํน์ value๋ก ๋ฐํํ๋ ๋์
     * **is**: ์ด๋ค ๊ฒ์ธ์ง ํ์ธํ ํ boolean์ผ๋ก ๋ฐํํ๋ ๋์
     * **has**: ์ด๋ค ๊ฒ์ ๊ฐ์ง๊ณ  ์๋์ง ํ์ธํ ํ boolean์ผ๋ก ๋ฐํํ๋ ๋์

5. **String - snake_case**

   * string ์ด๋ฆ์ **snake_case**๋ก ์์ฑ
   * id๋ช์ [where] _ []
   * ์์ฃผ ์ฐ์ผ ๊ฒ ๊ฐ์ string ๊ฐ์ ๊ฒฝ์ฐ๋ string _ [] : conflict ์ต์ํ๋ฅผ ์ํด ์ฌ์ฉ ์ , ๊ฒ์ ํ ์ฌ์ฉ

6. **variable / value - lowerCamelCase**

   * ๋ณ์ ์ด๋ฆ์ **lowerCamelCase**๋ก ์์ฑ
   * ์ ์ฒด ์ด๋ฆ์ ์ฒซ ๋ฌธ์๋ฅผ ์๋ฌธ์๋ก, ๋๋จธ์ง ๊ฐ ๋จ์ด์ ์ฒซ ๋ฌธ์๋ ๋๋ฌธ์๋ก ํ์


    </div>
</details>
<details>
  <summary><b>Packaging</b></summary>
<div markdown="1">

```
๐ฅTwitter - Main Branch (์์ฉ & ์ง์ค ๊ฐ๋ฐ)๐ฅ
  โฃ ๐ui
   โฃ ๐base
     โฃ ๐BaseActivity
     โ ๐BaseFragment
   โฃ ๐data
     โฃ ๐request
       โ ๐RequestWriteTwit
     โฃ ๐response
       โฃ ๐ResponseHeart
       โฃ ๐ResponseTwitList
       โ ๐ResponseUserInfoData
     โฃ ๐write
       โฃ ๐WriteRepository
       โ ๐WriteRequest
     โฃ ๐ApiService
     โฃ ๐ResponseType
     โฃ ๐REtrofitBuilder
     โ ๐WrapperClass
   โฃ ๐main
     โฃ ๐FanccyFragment
     โฃ ๐HomeActivity
     โฃ ๐InfoFragment
     โฃ ๐MediaFragment
     โฃ ๐ReplyFragment
     โฃ ๐TabViewPaterAdapter
     โฃ ๐TwitAdapter
     โฃ ๐TwitData
     โ ๐TwitFragment
   โฃ ๐write
     โฃ ๐WriteActivity
     โฃ ๐WriteAdatper
     โ ๐WriteViewModel
   โ ๐util
     โ ๐BindingAdapter
  โ๐App


๐ฅTwitter - Develop Branch (ํ๋น ๊ฐ๋ฐ)๐ฅ
  โฃ ๐data
   โฃ ๐api
     โฃ ๐ApiService
     โ ๐ServiceCreator
   โฃ ๐request
     โ ๐RequestWriteTwit
   โ ๐reponse
     โฃ ๐ResponseLike
     โฃ ๐ResponseTwitList
     โฃ ๐ResponseUserInfoData
     โ ๐ResponseWriteTwit
    โฃ ๐TwitData
    โ ๐WriteData
  โฃ ๐ui
   โฃ ๐base
     โฃ ๐BaseActivity
     โ ๐BaseFragment
   โฃ ๐main
     โฃ ๐adapter
      โฃ ๐HomeTabAdapter
      โ ๐TwitAdapter
     โฃ ๐viewmodel
      โ ๐HomeViewModel
     โฃ ๐HomeActivity
     โฃ ๐InfoFragment
     โฃ ๐MediaFragment
     โฃ ๐MindFragment
     โฃ ๐ReplyFragment
     โ ๐TwitFragment
   โฃ ๐write
     โฃ ๐adapter
      โ ๐WriteAdatper
     โฃ ๐viewmodel
      โ ๐WriteViewModel
     โ ๐WriteActivity
   โ ๐util
     โ ๐BindingAdapter
```
  </div>
</details>
