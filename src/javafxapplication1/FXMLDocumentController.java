/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author zygis
 */
public class FXMLDocumentController implements Initializable {

    private boolean english = true;
    private boolean danish = false;
    private boolean german = false;
    private boolean caps = true;
    private boolean onKey = false;

    @FXML
    private Button buttonSmall;
    @FXML
    private Button buttonMedium;
    @FXML
    private Button buttonLarge;
    @FXML
    private Label fontLabel;
    @FXML
    private Label langLabel;
    @FXML
    private Button keyboard;
    @FXML
    private Button phrases;
    @FXML
    private Button settings;
    @FXML
    private Button num1;
    @FXML
    private Button num2;
    @FXML
    private Button num3;
    @FXML
    private Button num4;
    @FXML
    private Button num5;
    @FXML
    private Button num6;
    @FXML
    private Button num7;
    @FXML
    private Button num8;
    @FXML
    private Button num9;
    @FXML
    private Button num0;
    @FXML
    private Button keyQ;
    @FXML
    private Button keyW;
    @FXML
    private Button keyE;
    @FXML
    private Button keyR;
    @FXML
    private Button keyT;
    @FXML
    private Button keyY;
    @FXML
    private Button keyU;
    @FXML
    private Button keyI;
    @FXML
    private Button keyO;
    @FXML
    private Button keyP;
    @FXML
    private Button keyA;
    @FXML
    private Button keyS;
    @FXML
    private Button keyD;
    @FXML
    private Button keyF;
    @FXML
    private Button keyG;
    @FXML
    private Button keyH;
    @FXML
    private Button keyJ;
    @FXML
    private Button keyK;
    @FXML
    private Button keyL;
    @FXML
    private Button keyZ;
    @FXML
    private Button keyX;
    @FXML
    private Button keyC;
    @FXML
    private Button keyV;
    @FXML
    private Button keyB;
    @FXML
    private Button keyN;
    @FXML
    private Button keyM;
    @FXML
    private Button keySpace;
    @FXML
    private Button keyEnter;
    @FXML
    private Button keyCaps;
    @FXML
    private Button keyBackspace;
    @FXML
    private TextArea text;
    @FXML
    private AnchorPane keyboardPane;
    @FXML
    private AnchorPane phrasesPane;
    @FXML
    private AnchorPane settingsPane;
    @FXML
    private Button buttonEnglish;
    @FXML
    private Button buttonDanish;
    @FXML
    private Button buttonGerman;
    @FXML
    private Button phrase1;
    @FXML
    private Button phrase2;
    @FXML
    private Button phrase3;
    private Timer timer;

    @FXML
    private void handleLanguageEng(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    javafx.application.Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            keyboard.setText("Keyboard");
                            settings.setText("Settings");
                            phrases.setText("Phrases");
                            langLabel.setText("Language:");
                            fontLabel.setText("Font size:");
                            buttonSmall.setText("Small");
                            buttonMedium.setText("Medium");
                            buttonLarge.setText("Large");
                            english = true;
                            danish = false;
                            german = false;
                            timer.cancel();
                        }

                    });
                }
            }
        }, 2000);
    }

    @FXML
    private void handleFontSmall(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    javafx.application.Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            text.setFont(new Font(16.0));
                            phrase1.setFont(new Font(12.0));
                            phrase2.setFont(new Font(12.0));
                            phrase3.setFont(new Font(12.0));
                            langLabel.setFont(new Font(12.0));
                            fontLabel.setFont(new Font(12.0));
                            keyCaps.setFont(new Font(12.0));
                            keyEnter.setFont(new Font(12.0));
                            keyBackspace.setFont(new Font(12.0));
                            keySpace.setFont(new Font(12.0));
                            keyboard.setFont(new Font(12.0));
                            settings.setFont(new Font(12.0));
                            phrases.setFont(new Font(12.0));
                            buttonSmall.setFont(new Font(12.0));
                            buttonMedium.setFont(new Font(12.0));
                            buttonLarge.setFont(new Font(12.0));
                            buttonGerman.setFont(new Font(12.0));
                            buttonEnglish.setFont(new Font(12.0));
                            buttonDanish.setFont(new Font(12.0));
                            num1.setFont(new Font(12.0));
                            num2.setFont(new Font(12.0));
                            num3.setFont(new Font(12.0));
                            num4.setFont(new Font(12.0));
                            num5.setFont(new Font(12.0));
                            num6.setFont(new Font(12.0));
                            num7.setFont(new Font(12.0));
                            num8.setFont(new Font(12.0));
                            num9.setFont(new Font(12.0));
                            num0.setFont(new Font(12.0));
                            keyA.setFont(new Font(12.0));
                            keyB.setFont(new Font(12.0));
                            keyC.setFont(new Font(12.0));
                            keyD.setFont(new Font(12.0));
                            keyE.setFont(new Font(12.0));
                            keyF.setFont(new Font(12.0));
                            keyG.setFont(new Font(12.0));
                            keyH.setFont(new Font(12.0));
                            keyI.setFont(new Font(12.0));
                            keyJ.setFont(new Font(12.0));
                            keyK.setFont(new Font(12.0));
                            keyL.setFont(new Font(12.0));
                            keyM.setFont(new Font(12.0));
                            keyN.setFont(new Font(12.0));
                            keyO.setFont(new Font(12.0));
                            keyP.setFont(new Font(12.0));
                            keyQ.setFont(new Font(12.0));
                            keyR.setFont(new Font(12.0));
                            keyS.setFont(new Font(12.0));
                            keyT.setFont(new Font(12.0));
                            keyU.setFont(new Font(12.0));
                            keyV.setFont(new Font(12.0));
                            keyW.setFont(new Font(12.0));
                            keyX.setFont(new Font(12.0));
                            keyY.setFont(new Font(12.0));
                            keyZ.setFont(new Font(12.0));

                            timer.cancel();
                        }

                    });
                }
            }
        }, 2000);
    }

    @FXML
    private void handleFontMedium(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    javafx.application.Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            text.setFont(new Font(19.0));
                            phrase1.setFont(new Font(16.0));
                            phrase2.setFont(new Font(16.0));
                            phrase3.setFont(new Font(16.0));
                            langLabel.setFont(new Font(16.0));
                            fontLabel.setFont(new Font(16.0));
                            keyCaps.setFont(new Font(16.0));
                            keyEnter.setFont(new Font(16.0));
                            keyBackspace.setFont(new Font(16.0));
                            keySpace.setFont(new Font(16.0));
                            keyboard.setFont(new Font(16.0));
                            settings.setFont(new Font(16.0));
                            phrases.setFont(new Font(16.0));
                            buttonSmall.setFont(new Font(16.0));
                            buttonMedium.setFont(new Font(16.0));
                            buttonLarge.setFont(new Font(16.0));
                            buttonGerman.setFont(new Font(16.0));
                            buttonEnglish.setFont(new Font(16.0));
                            buttonDanish.setFont(new Font(16.0));
                            num1.setFont(new Font(16.0));
                            num2.setFont(new Font(16.0));
                            num3.setFont(new Font(16.0));
                            num4.setFont(new Font(16.0));
                            num5.setFont(new Font(16.0));
                            num6.setFont(new Font(16.0));
                            num7.setFont(new Font(16.0));
                            num8.setFont(new Font(16.0));
                            num9.setFont(new Font(16.0));
                            num0.setFont(new Font(16.0));
                            keyA.setFont(new Font(16.0));
                            keyB.setFont(new Font(16.0));
                            keyC.setFont(new Font(16.0));
                            keyD.setFont(new Font(16.0));
                            keyE.setFont(new Font(16.0));
                            keyF.setFont(new Font(16.0));
                            keyG.setFont(new Font(16.0));
                            keyH.setFont(new Font(16.0));
                            keyI.setFont(new Font(16.0));
                            keyJ.setFont(new Font(16.0));
                            keyK.setFont(new Font(16.0));
                            keyL.setFont(new Font(16.0));
                            keyM.setFont(new Font(16.0));
                            keyN.setFont(new Font(16.0));
                            keyO.setFont(new Font(16.0));
                            keyP.setFont(new Font(16.0));
                            keyQ.setFont(new Font(16.0));
                            keyR.setFont(new Font(16.0));
                            keyS.setFont(new Font(16.0));
                            keyT.setFont(new Font(16.0));
                            keyU.setFont(new Font(16.0));
                            keyV.setFont(new Font(16.0));
                            keyW.setFont(new Font(16.0));
                            keyX.setFont(new Font(16.0));
                            keyY.setFont(new Font(16.0));
                            keyZ.setFont(new Font(16.0));

                            timer.cancel();
                        }

                    });
                }
            }
        }, 2000);
    }

    @FXML
    private void handleFontLarge(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    javafx.application.Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            text.setFont(new Font(22.0));
                            phrase1.setFont(new Font(19.0));
                            phrase2.setFont(new Font(19.0));
                            phrase3.setFont(new Font(19.0));
                            langLabel.setFont(new Font(19.0));
                            fontLabel.setFont(new Font(19.0));
                            keyCaps.setFont(new Font(19.0));
                            keyEnter.setFont(new Font(19.0));
                            keyBackspace.setFont(new Font(19.0));
                            keySpace.setFont(new Font(19.0));
                            keyboard.setFont(new Font(19.0));
                            settings.setFont(new Font(19.0));
                            phrases.setFont(new Font(19.0));
                            buttonSmall.setFont(new Font(19.0));
                            buttonMedium.setFont(new Font(19.0));
                            buttonLarge.setFont(new Font(19.0));
                            buttonGerman.setFont(new Font(19.0));
                            buttonEnglish.setFont(new Font(19.0));
                            buttonDanish.setFont(new Font(19.0));
                            num1.setFont(new Font(19.0));
                            num2.setFont(new Font(19.0));
                            num3.setFont(new Font(19.0));
                            num4.setFont(new Font(19.0));
                            num5.setFont(new Font(19.0));
                            num6.setFont(new Font(19.0));
                            num7.setFont(new Font(19.0));
                            num8.setFont(new Font(19.0));
                            num9.setFont(new Font(19.0));
                            num0.setFont(new Font(19.0));
                            keyA.setFont(new Font(19.0));
                            keyB.setFont(new Font(19.0));
                            keyC.setFont(new Font(19.0));
                            keyD.setFont(new Font(19.0));
                            keyE.setFont(new Font(19.0));
                            keyF.setFont(new Font(19.0));
                            keyG.setFont(new Font(19.0));
                            keyH.setFont(new Font(19.0));
                            keyI.setFont(new Font(19.0));
                            keyJ.setFont(new Font(19.0));
                            keyK.setFont(new Font(19.0));
                            keyL.setFont(new Font(19.0));
                            keyM.setFont(new Font(19.0));
                            keyN.setFont(new Font(19.0));
                            keyO.setFont(new Font(19.0));
                            keyP.setFont(new Font(19.0));
                            keyQ.setFont(new Font(19.0));
                            keyR.setFont(new Font(19.0));
                            keyS.setFont(new Font(19.0));
                            keyT.setFont(new Font(19.0));
                            keyU.setFont(new Font(19.0));
                            keyV.setFont(new Font(19.0));
                            keyW.setFont(new Font(19.0));
                            keyX.setFont(new Font(19.0));
                            keyY.setFont(new Font(19.0));
                            keyZ.setFont(new Font(19.0));

                            timer.cancel();
                        }

                    });
                }
            }
        }, 2000);
    }

    @FXML
    private void handleLanguageDan(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    javafx.application.Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            keyboard.setText("Tastatur");
                            settings.setText("Indstillinger");
                            phrases.setText("Sætninger");
                            langLabel.setText("Sprog:");
                            fontLabel.setText("Skriftstørrelse:");
                            buttonSmall.setText("Lille");
                            buttonMedium.setText("Medium");
                            buttonLarge.setText("Stor");
                            phrase1.setText("Jeg er sulten.");
                            phrase2.setText("Jeg ønsker at gå på toilettet.");
                            phrase3.setText("Jeg har brug for hjælp med computeren.");
                            english = false;
                            danish = true;
                            german = false;
                            timer.cancel();
                        }
                    }
                    );
                }
            }
        }, 2000);
    }

    @FXML
    private void handleLanguageGer(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    javafx.application.Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            keyboard.setText("Tastatur");
                            settings.setText("Einstellungen");
                            phrases.setText("Phrase");
                            langLabel.setText("Sprache:");
                            fontLabel.setText("Schriftgröße:");
                            buttonSmall.setText("Klein");
                            buttonMedium.setText("Mittel");
                            buttonLarge.setText("Groß");
                               phrase1.setText("Ich bin hungrig.");
                            phrase2.setText("Ich will ins Badezimmer gehen.");
                            phrase3.setText("Ich brauche Hilfe mit dem Computer.");

                            english = false;
                            danish = false;
                            german = true;
                            timer.cancel();
                        }
                    });
                }
            }
        }, 2000);
    }

    @FXML
    private void handleKeyAction(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    text.appendText(String.valueOf(event.getSource().toString().charAt(35)));
                    timer.cancel();
                }
            }
        }, 2000);
    }

    @FXML
    private void handleSpace(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    text.appendText(" ");
                    timer.cancel();
                }
            }
        }, 2000);
    }

    @FXML
    private void handleCapsLock(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    if (caps == true) {
                        javafx.application.Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                caps = false;
                                keyA.setText("a");
                                keyB.setText("b");
                                keyC.setText("c");
                                keyD.setText("d");
                                keyE.setText("e");
                                keyF.setText("f");
                                keyG.setText("g");
                                keyH.setText("h");
                                keyI.setText("i");
                                keyJ.setText("j");
                                keyK.setText("k");
                                keyL.setText("l");
                                keyM.setText("m");
                                keyN.setText("n");
                                keyO.setText("o");
                                keyP.setText("p");
                                keyQ.setText("q");
                                keyR.setText("r");
                                keyS.setText("s");
                                keyT.setText("t");
                                keyU.setText("u");
                                keyV.setText("v");
                                keyW.setText("w");
                                keyX.setText("x");
                                keyY.setText("y");
                                keyZ.setText("z");
                                timer.cancel();
                            }
                        });
                    } else {

                        javafx.application.Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                caps = true;
                                keyA.setText("A");
                                keyB.setText("B");
                                keyC.setText("C");
                                keyD.setText("D");
                                keyE.setText("E");
                                keyF.setText("F");
                                keyG.setText("G");
                                keyH.setText("H");
                                keyI.setText("I");
                                keyJ.setText("J");
                                keyK.setText("K");
                                keyL.setText("L");
                                keyM.setText("M");
                                keyN.setText("N");
                                keyO.setText("O");
                                keyP.setText("P");
                                keyQ.setText("Q");
                                keyR.setText("R");
                                keyS.setText("S");
                                keyT.setText("T");
                                keyU.setText("U");
                                keyV.setText("V");
                                keyW.setText("W");
                                keyX.setText("X");
                                keyY.setText("Y");
                                keyZ.setText("Z");
                                timer.cancel();
                            }
                        });
                    }
                }
            }
        },
                2000);
    }

    @FXML
    private void handleKeyboardKey(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    keyboardPane.setVisible(true);
                    phrasesPane.setVisible(false);
                    settingsPane.setVisible(false);
                    timer.cancel();
                }
            }
        }, 2000);

    }

    @FXML
    private void handlePhrasesKey(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    keyboardPane.setVisible(false);
                    phrasesPane.setVisible(true);
                    settingsPane.setVisible(false);
                    timer.cancel();
                }
            }
        }, 2000);

    }

    @FXML
    private void handleSettingsKey(Event event) {
        onKey = true;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (onKey) {
                    keyboardPane.setVisible(false);
                    phrasesPane.setVisible(false);
                    settingsPane.setVisible(true);
                    timer.cancel();
                }
            }
        }, 2000);

    }

    @FXML
    private void pointerExitedKey(Event event) {
        onKey = false;
        timer.cancel();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
