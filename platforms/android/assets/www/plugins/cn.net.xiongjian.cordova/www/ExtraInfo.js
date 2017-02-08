cordova.define("cn.net.xiongjian.cordova.ExtraInfo", function(require, exports, module) { var exec = require('cordova/exec');

exports.getExtra = function(success, error) {
    exec(success, error, "ExtraInfo", "getExtra", []);
};


});
