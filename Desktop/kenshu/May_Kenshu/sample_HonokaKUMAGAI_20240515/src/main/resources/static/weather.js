fetch('http://localhost:8080/weather', {
  method: 'POST', // POSTメソッドを指定
  headers: {
    'Content-Type': 'application/json' // リクエストヘッダーにJSON形式を指定
  },
  body: JSON.stringify({ areaCode: 'your_area_code_here' }) // リクエストボディにJSONデータを設定
})
.then(response => response.json()) // レスポンスをJSON形式に変換
.then(data => {
  // 取得したデータを表示するなどの処理を行う
  console.log(data);
})
.catch(error => {
  // エラーハンドリング
  console.error('Error fetching weather data:', error);
});
