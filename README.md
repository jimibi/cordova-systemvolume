## Description

Plugin to set and get volume of the music stream.

## Supported Platforms

Android

## Installation

Adding the Plugin to your project:
```bash
cordova plugin add https://github.com/jimibi/cordova-systemvolume.git
```
Removing the plugin to your proect:
```bash
cordova plugin rm fr.edps.systemvolume
```

## Example

```bash
//set the sound to maximum
window.system.setSystemVolume(1.0);
//get the system volume
Level = window.system.getSystemVolume();  // 0.0 to 1.0
```
