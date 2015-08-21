<<<<<<< HEAD
/*global cordova, module*/

module.exports = {
    setSystemVolume: function(volume, sucessCallback) {
        cordova.exec(sucessCallback, errorCallback, "SystemVolume", "setSystemVolume", [volume]);
    },
    setAudioVolume: function(volume, sucessCallback) {
        cordova.exec(sucessCallback, errorCallback, "SystemVolume", "setAudioVolume", [volume]);
    },
    getSystemVolume: function(sucessCallback) {
        return cordova.exec(sucessCallback, errorCallback, "SystemVolume", "getSystemVolume", []);
=======
var exec = require('cordova/exec');

module.exports = {

    setSystemVolume: function(volume) {
        exec(null, null, "SystemVolume", "setSystemVolume", [volume]);
    },
    getSystemVolume: function() {
        return exec(null, null, "SystemVolume", "getSystemVolume", []);
>>>>>>> origin/master
    },
};
