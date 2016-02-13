var CopyWebpackPlugin = require('copy-webpack-plugin');

module.exports = {
  entry: "./src/app.js",
  output: {
    path: __dirname + '/build',
    filename: "bundle.js"
  },
  module: {
    loaders: []
  },
  plugins: [
    new CopyWebpackPlugin([
      {from: 'index.html'}
    ])
  ]
};