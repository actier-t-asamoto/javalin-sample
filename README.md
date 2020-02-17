# Javalin 使ってみた

## 特徴

### 起動がかなり早い
- SpringBootだとシンプルなアプリケーションでも立ち上がるまでに10秒くらいかかる
- Javalinはリソース一つ程度のAPIなら250ms程度で立ち上がる

### GraalVM上での動作も保証されている
- Tutorialに手順もあるため導入しやすい
- (次のLTで試す)

### ルーティングから追いやすい
- configファイルで指定したりAnnotationで指定したりするわけではない
- Applicationの起動のロジックでソースコードとして記述する

### DIはあまり使わない
- アノテーションは一切使わないスタイル
- DI使うとオブジェクト管理が必要になり、それが重くなる原因になる

### 基本的な考え方がCRUDを行う方向に寄っている
- Controllerの実装にCrudHandlerというinterfaceをimplementsする
- 凝ったものを作るよりもサクッと作る方が向いてそう

### テンプレートエンジンをサポートしている
- Thymeleaf, Velocityなどが利用可能(LTでは試さない)

### O/Rマッパーとの連携は今の所ない
- 各種ライブラリを使って自前で呼び出す必要がある(次のLTで試す)

## APIサーバーのサンプル実装してみた
- ソースコードを眺める
  - ルーティングから追いやすいことを確認
  - CrudHandlerのinterfaceを眺める
- 実行が早いことを確認する
- curlしてみる

### 公式tutorialを見る
[Tutorials - Javalin - A lightweight Java and Kotlin web framework](https://javalin.io/tutorials/)

- GraalVMに乗せる方法がある
- Kotlinでも実装可能
- Javalin + Vue.jsのサンプルあり
- テストサンプルあり
- WebSocketサンプルあり
