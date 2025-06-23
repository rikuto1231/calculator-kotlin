# 🧮 Kotlin Calculator Web App

Spring Boot + Kotlinで作成された美しい電卓Webアプリケーションです。

## ✨ 機能

- **四則演算**: 加算、減算、乗算、除算
- **美しいUI**: モダンなデザインとアニメーション
- **キーボードサポート**: 数字キーと演算子キーで操作可能
- **計算履歴**: 過去の計算結果を表示
- **エラーハンドリング**: ゼロ除算などのエラー処理
- **レスポンシブデザイン**: スマートフォンでも使用可能
- **DevTools**: 開発時の自動リロード機能

## 🚀 セットアップ

### 前提条件
- Java 17以上
- Gradle

### 実行手順

1. **リポジトリをクローン**
```bash
git clone https://github.com/あなたのユーザー名/リポジトリ名.git
cd リポジトリ名
```

2. **アプリケーションを起動**
```bash
./gradlew bootRun
```

3. **ブラウザでアクセス**
- メインページ: http://localhost:8080/
- 電卓ページ: http://localhost:8080/calculator.html

## 🛠️ 技術スタック

- **Backend**: Kotlin + Spring Boot 3.3.0
- **Frontend**: HTML5 + CSS3 + JavaScript
- **Build Tool**: Gradle
- **Dev Tools**: Spring Boot DevTools

## 📁 プロジェクト構造

```
src/
├── main/
│   ├── kotlin/org/example/
│   │   ├── SampleApplication.kt          # Spring Bootメインクラス
│   │   └── controller/
│   │       ├── HelloController.kt        # Hello World API
│   │       └── CalculatorController.kt   # 電卓API
│   └── resources/
│       ├── static/
│       │   ├── index.html               # メインページ
│       │   └── calculator.html          # 電卓ページ
│       └── application.properties       # アプリケーション設定
```

## 🎯 API エンドポイント

- `GET /` - メインページ
- `GET /calculator.html` - 電卓ページ
- `POST /api/calculator/calculate` - 計算実行
- `GET /api/calculator/history` - 計算履歴
- `GET /api/hello` - Hello World API
- `GET /kotlin` - KotlinメッセージAPI

## 🎨 特徴

- **Neumorphismデザイン**: モダンな3Dボタンデザイン
- **グラデーション背景**: 美しい視覚効果
- **アニメーション**: ホバー効果とクリックアニメーション
- **レスポンシブ**: モバイル対応

## 🔧 開発

### DevTools機能
- ファイル変更時の自動リロード
- LiveReloadサーバー
- ホットリロード

### キーボードショートカット
- 数字キー: 数字入力
- 演算子キー: +, -, *, /
- Enter/=: 計算実行
- Escape: クリア
- Backspace: バックスペース

## 📝 ライセンス

MIT License

## 🤝 コントリビューション

プルリクエストやイシューの報告を歓迎します！

---

**お楽しみください！** 🎉 