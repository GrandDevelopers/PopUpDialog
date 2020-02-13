# Grand Developers Team Popup Dialog

http://2grand.net/img/gr.gif

Download
--------

Or use Gradle:

```gradle
repositories {
  mavenCentral()
  google()
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.GrandDevelopers:PopUpDialog:x.x'
}

```

install lateset version updated
[![](https://jitpack.io/v/GrandDevelopers/PopUpDialog.svg)](https://jitpack.io/#GrandDevelopers/PopUpDialog)

Or Maven:

```xml
<dependency>
    <groupId>com.github.GrandDevelopers</groupId>
    <artifactId>Mvil</artifactId>
    <version>x.x</version>
</dependency>
<repositories>
     <repository>
         <id>jitpack.io</id>
         <url>https://jitpack.io</url>
     </repository>
</repositories>
```
https://jitpack.io/v/jitpack/maven-simple.svg

# PopUpGrandDevelopersDialog
Popup Dialog is a simple, customizable popup dialog written in Java.


## PopUpSimpleDialog
                new GrPopUpSimple(MainActivity.this)
                        .setTitle("Dialog Grand PopUp")
                        .setTitleColor(Color.BLACK)
                        .setMessage("Please complete this action")
                        .setMessageColor(Color.GRAY)
                        .setFirstButtonText("Login")
                        .setFirstTextColor(Color.WHITE)
                        .setSecondButtonText("Register")
                        .setSecondTextColor(Color.WHITE)
                        .setBackgroundDialogColor(Color.WHITE)
                        .setFirstBackgroundColor(R.color.colorPrimary)
                        .setSecondBackgroundColor(R.color.colorPrimaryDark)
                        .setImage(R.drawable.grand)
                        .setExitColor(R.color.colorGrey)
                        .setExitEnable(true)
                        .show(new IPopUpActionInterface() {
                            @Override
                            public void onFirstButton(Dialog dialog, View view) {
                            }

                            @Override
                            public void onSecondButton(Dialog dialog, View view) {
                            }
                        });
                        
                        
## PopUpCircleDialog

            new GrPopUpCircle(MainActivity.this)
                        .setTitle("Dialog Grand PopUp")
                        .setTitleColor(Color.BLACK)
                        .setMessage("Please complete this action")
                        .setMessageColor(Color.GRAY)
                        .setFirstButtonText("Login")
                        .setFirstTextColor(Color.WHITE)
                        .setSecondButtonText("Register")
                        .setSecondTextColor(Color.WHITE)
                        .setBackgroundDialogColor(Color.WHITE)
                        .setFirstBackgroundColor(R.color.colorPrimary)
                        .setSecondBackgroundColor(R.color.colorPrimaryDark)
                        .setImage(R.drawable.info)
                        .setExitColor(R.color.colorPrimary)
                        .setExitEnable(true)
                        .show(new IPopUpActionInterface() {
                            @Override
                            public void onFirstButton(Dialog dialog, View view) {
                            }

                            @Override
                            public void onSecondButton(Dialog dialog, View view) {
                            }
                        });


