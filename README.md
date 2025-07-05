# 🧮 Kotlin Calculator Web App

Spring Boot + Kotlinで作成された電卓Webアプリケーション

## 📱 機能

- **四則演算**: 加算、減算、乗算、除算
- **計算履歴**: 過去の計算結果を表示
- **キーボード操作**: 数字キーと演算子キーに対応
- **レスポンシブデザイン**: スマートフォンでも使用可能
- **美しいUI**: モダンなNeumorphismデザイン

## 🚀 起動方法

```bash
# リポジトリをクローン
git clone https://github.com/rikuto1231/calculator-kotlin.git
cd calculator-kotlin

# アプリケーションを起動
./gradlew bootRun
```

## 📍 アクセス先

- **メインページ**: http://localhost:8080/
- **電卓アプリ**: http://localhost:8080/calculator.html

## 🛠️ 技術スタック

- **Backend**: Kotlin + Spring Boot 3.3.0
- **Frontend**: HTML5 + CSS3 + JavaScript
- **Build Tool**: Gradle
- **Java**: 17以上

## 🎯 API エンドポイント

- `POST /api/calculator/calculate` - 計算実行
- `GET /api/calculator/history` - 計算履歴取得
- `GET /api/hello` - Hello World API
- `GET /kotlin` - Kotlinメッセージ表示

---
