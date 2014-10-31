var exec = require('cordova/exec');

module.exports = {

    setSystemVolume: function(volume) {
        exec(null, null, "SystemVolume", "setSystemVolume", [volume]);
    },
    getSystemVolume: function() {
        return exec(null, null, "SystemVolume", "getSystemVolume", []);
    },
};
