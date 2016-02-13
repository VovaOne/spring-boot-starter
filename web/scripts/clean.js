const path = require('path');
const rmdir = require('rmdir');


rmdir(path.resolve(__dirname, '../build'), function(err, dirs, files) {
  console.log(dirs);
  console.log(files);
  console.log('clean completed');
});