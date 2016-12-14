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
import javafx.scene.control.TextArea;

/**
 *
 * @author zygis
 */
public class FXMLDocumentController implements Initializable {

    private boolean caps = true;
    private boolean onKey = false;
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
    private TextArea text;
    private Timer timer;

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
                                caps=false;
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
                                caps=true;
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
    private void pointerExitedKey(Event event) {
        onKey = false;
        timer.cancel();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
