var cordova = require('cordova');

/**

 * @constructor
 */
function FusedLocation () {}


FusedLocation.prototype.getLocation = function (onSuccess, onFail) {   
	cordova.exec(onSuccess, onFail, "FusedLocation", "getLocation", []);
};
FusedLocation.prototype.getCurrentAddress = function (onSuccess, onFail) {   
	cordova.exec(onSuccess, onFail, "FusedLocation", "getCurrentAddress", []);
};


// Register the plugin
var fusedlocation = new FusedLocation();
module.exports = fusedlocation;

