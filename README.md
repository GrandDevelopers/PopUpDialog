# PopUpDialog
Popup Dialog is a simple, customizable popup dialog written in Java.


# PopUpDialog
                new PopUp(MainActivity.this)
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
                                Toast.makeText(MainActivity.this, "First Click", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onSecondButton(Dialog dialog, View view) {
                                Toast.makeText(MainActivity.this, "Second Click", Toast.LENGTH_SHORT).show();
                            }
                        });
                        
                        
# PopUpCircleDialog

            new PopUpCircle(MainActivity.this)
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
                                Toast.makeText(MainActivity.this, "First Click", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onSecondButton(Dialog dialog, View view) {
                                Toast.makeText(MainActivity.this, "Second Click", Toast.LENGTH_SHORT).show();
                            }
                        });


