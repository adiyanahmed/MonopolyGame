package MonopolyGUI;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Adiyan Ahmed
 */
public class MonopolyGUI extends javax.swing.JFrame {

    Graphics g;
    int bluePos = 0; //array index for player 1 
    int redPos = 0; //array index for player 2
    int greenPos = 0; //array index for player 3
    int orangePos = 0; //array index for player 4

    int xPos[] = {565, 565, 565, 565, 565, 500, 420, 340, 260, 180, 100, 20, 20, 20, 20, 20, 180, 260, 340, 420}; //array for x-positions
    int yPos[] = {500, 420, 340, 260, 180, 40, 40, 40, 40, 40, 40, 180, 260, 340, 420, 500, 565, 565, 565, 565}; //array for y-positions

    int boardPos; //common index for position array
    int playerNumber = 0; //player number, starts at 0 then loops 1-4

    //determining original player balances
    int player1Bal = 200;
    int player2Bal = 200;
    int player3Bal = 200;
    int player4Bal = 200;

    //determining property ownership at board position 1
    boolean case1Bought;
    boolean blue1;
    boolean red1;
    boolean green1;
    boolean orange1;

    //determining property ownership at board position 2
    boolean case2Bought;
    boolean blue2;
    boolean red2;
    boolean green2;
    boolean orange2;

    //determining property ownership at board position 4
    boolean case4Bought;
    boolean blue4;
    boolean red4;
    boolean green4;
    boolean orange4;

    //determining property ownership at board position 6
    boolean case6Bought;
    boolean blue6;
    boolean red6;
    boolean green6;
    boolean orange6;

    //determining property ownership at board position 7
    boolean case7Bought;
    boolean blue7;
    boolean red7;
    boolean green7;
    boolean orange7;

    //determining property ownership at board position 9
    boolean case9Bought;
    boolean blue9;
    boolean red9;
    boolean green9;
    boolean orange9;

    //determining property ownership at board position 11
    boolean case11Bought;
    boolean blue11;
    boolean red11;
    boolean green11;
    boolean orange11;

    //determining property ownership at board position 13
    boolean case13Bought;
    boolean blue13;
    boolean red13;
    boolean green13;
    boolean orange13;

    //determining property ownership at board position 14
    boolean case14Bought;
    boolean blue14;
    boolean red14;
    boolean green14;
    boolean orange14;

    //determining property ownership at board position 16
    boolean case16Bought;
    boolean blue16;
    boolean red16;
    boolean green16;
    boolean orange16;

    //determining property ownership at board position 17
    boolean case17Bought;
    boolean blue17;
    boolean red17;
    boolean green17;
    boolean orange17;

    //determining property ownership at board position 19
    boolean case19Bought;
    boolean blue19;
    boolean red19;
    boolean green19;
    boolean orange19;

    //determining if player is still in game or not 
    boolean player1Bankrupt = false; //if set to true, means player is bankrupt/out
    boolean player2Bankrupt = false;
    boolean player3Bankrupt = false;
    boolean player4Bankrupt = false;

    public MonopolyGUI() {
        initComponents();
        g = monopolyBoard.getGraphics();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        rollButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        diceFace = new javax.swing.JLabel();
        priceList = new javax.swing.JLabel();
        monopolyBoard = new javax.swing.JLabel();
        player1Balance = new javax.swing.JLabel();
        player2Balance = new javax.swing.JLabel();
        player3Balance = new javax.swing.JLabel();
        player4Balance = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        instructions1 = new javax.swing.JLabel();
        instructions2 = new javax.swing.JLabel();
        instructions3 = new javax.swing.JLabel();
        instructions4 = new javax.swing.JLabel();
        instructions5 = new javax.swing.JLabel();
        instructions6 = new javax.swing.JLabel();
        instructions7 = new javax.swing.JLabel();
        instructions8 = new javax.swing.JLabel();
        instructions9 = new javax.swing.JLabel();
        instructions10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));

        rollButton.setBackground(new java.awt.Color(255, 255, 255));
        rollButton.setText("ROLL");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        buyButton.setBackground(new java.awt.Color(255, 255, 255));
        buyButton.setText("BUY");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        diceFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyGUI/dice1.JPG"))); // NOI18N

        priceList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyGUI/prices - Copy.JPG"))); // NOI18N

        monopolyBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MonopolyGUI/monopolyBoard.jpg"))); // NOI18N
        monopolyBoard.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                monopolyBoardMouseMoved(evt);
            }
        });

        player1Balance.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        player1Balance.setText("Player 1: $200");

        player2Balance.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        player2Balance.setText("Player 2: $200");

        player3Balance.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        player3Balance.setText("Player 3: $200");

        player4Balance.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        player4Balance.setText("Player 4: $200");

        exitButton.setText("EXIT");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        instructions1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions1.setText("INSTRUCTIONS:");

        instructions2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions2.setText("Each player starts with $200.");

        instructions3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions3.setText("Click roll to move through the board.");

        instructions4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions4.setText("Click buy to purchase a property if no one else has...");

        instructions5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions5.setText("or click roll to move the next player. ");

        instructions6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions6.setText("Everytime you land on another player's property...");

        instructions7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions7.setText("you must pay them rent.");

        instructions8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions8.setText("If you run out of money, you go bankrupt and lose!");

        instructions9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions9.setText("Be the last player with money to win!");

        instructions10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        instructions10.setText("Everytime you pass GO, you receive $50");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Community Chest:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Chance Card:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monopolyBoard)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(instructions2)
                            .addComponent(instructions1)
                            .addComponent(instructions3)
                            .addComponent(instructions4)
                            .addComponent(instructions5)
                            .addComponent(instructions6)
                            .addComponent(instructions7)
                            .addComponent(instructions8)
                            .addComponent(instructions9)
                            .addComponent(instructions10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceList, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(player1Balance)
                                    .addComponent(player2Balance)
                                    .addComponent(player3Balance)
                                    .addComponent(player4Balance))
                                .addContainerGap(70, Short.MAX_VALUE))
                            .addComponent(diceFace, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(diceFace, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(player1Balance)
                                .addGap(38, 38, 38)
                                .addComponent(player2Balance)
                                .addGap(36, 36, 36)
                                .addComponent(player3Balance)
                                .addGap(36, 36, 36)
                                .addComponent(player4Balance))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monopolyBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructions6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructions7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instructions9)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed
        //resetting chance and community text
        jLabel1.setText("Community Chest:");
        jLabel2.setText("Chance Card:");

        //changing which player is moving (1-4)      
        playerNumber = playerNumber + 1;
        if (playerNumber == 5) { //changes player number back to 1 
            playerNumber = 1;
        }
        if (playerNumber == 1 && player1Bankrupt == true) { //if player 1 is bankrupt, skip turn
            playerNumber = playerNumber + 1;
        }
        if (playerNumber == 2 && player2Bankrupt == true) { //if player 2 is bankrupt, skip turn
            playerNumber = playerNumber + 1;
        }
        if (playerNumber == 3 && player3Bankrupt == true) { //if player 3 is bankrupt, skip turn
            playerNumber = playerNumber + 1;
        }
        if (playerNumber == 4 && player4Bankrupt == true) { //if player 4 is bankrupt, skip turn
            playerNumber = 1;
        }

        //updating if bankrupt
        if (player1Bal <= 0) {
            player1Balance.setText("Player 1: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player1Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //removing player from board 
            player1Bal = 0;
        }

        if (player2Bal <= 0) {
            player2Balance.setText("Player 2: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player2Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10); //removing player from board
            player2Bal = 0;
        }

        if (player3Bal <= 0) {
            player3Balance.setText("Player 3: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player3Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10); //removing player from board
            player3Bal = 0;
        }

        if (player4Bal <= 0) {
            player4Balance.setText("Player 4: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player4Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10); //removing player from board
            player4Bal = 0;
        }

        //determining random dice number
        int max = 6;
        int min = 1;
        int rollNumber = (int) ((Math.random() * ((max - min) + 1)) + min);

        //dice animations
        if (rollNumber == 1) {
            diceFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice1.jpg"))); //displaying dice face according to random number
        }
        if (rollNumber == 2) {
            diceFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice2.jpg")));
        }
        if (rollNumber == 3) {
            diceFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice3.jpg")));
        }
        if (rollNumber == 4) {
            diceFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice4.jpg")));
        }
        if (rollNumber == 5) {
            diceFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice5.jpg")));
        }
        if (rollNumber == 6) {
            diceFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice6.jpg")));
        }

        //player 1 movement (control)
        if (playerNumber == 1) {
            g.setColor(Color.white);
            g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //covering up the last position of player 1

            bluePos = bluePos + rollNumber; //moving player through board according to dice number
            if (bluePos > 19) {
                bluePos = bluePos - 20; //resetting array index to let player pass GO
                player1Bal = player1Bal + 50; //giving player 50 everytime they pass GO
            }

            g.setColor(Color.blue);
            g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //drawing player at new position

            boardPos = bluePos; //setting general index to current player's index
        }

        //player 2 movement (control)
        if (playerNumber == 2) {
            g.setColor(Color.white);
            g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10); //covering up the last position of player 2

            redPos = redPos + rollNumber; //moving player through board according to dice number
            if (redPos > 19) {
                redPos = redPos - 20; //resetting array index to let player pass GO
                player2Bal = player2Bal + 50;//giving player 50 everytime they pass GO
            }

            g.setColor(Color.red);
            g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10); //drawing player at new position

            boardPos = redPos; //setting general index to current player's index
        }

        //player 3 movement (control)
        if (playerNumber == 3) {
            g.setColor(Color.white);
            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10); //covering up the last position of player 3

            greenPos = greenPos + rollNumber; //moving player through board according to dice number
            if (greenPos > 19) {
                greenPos = greenPos - 20; //resetting array index to let player pass GO
                player3Bal = player3Bal + 50;//giving player 50 everytime they pass GO
            }

            g.setColor(Color.green);
            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10); //drawing player at new position

            boardPos = greenPos; //setting general index to current player's index
        }

        //player 4 movement (control)
        if (playerNumber == 4) {
            g.setColor(Color.white);
            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10); //covering up the last position of player 4

            orangePos = orangePos + rollNumber; //moving player through board according to dice number
            if (orangePos > 19) {
                orangePos = orangePos - 20; //resetting array index to let player pass GO
                player4Bal = player4Bal + 50;//giving player 50 everytime they pass GO
            }

            g.setColor(Color.orange);
            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10); //drawing player at new position

            boardPos = orangePos; //setting general index to current player's index
        }

        //EVENTS OF BOARD POSITIONS (paying rent + community/chance) 
        switch (boardPos) {
            
            //managing rent at board position 1
            case 1:
                if (playerNumber == 1) {
                    if (red1 == true && player2Bankrupt == false) { //if player 2 owns property and player 1 lands on it
                        player2Bal = player2Bal + 9; //giving money to property owner                       
                        player1Bal = player1Bal - 9; //taking money from renter
                    }
                    if (green1 == true && player3Bankrupt == false) { //if player 3 owns property and player 1 lands on it
                        player3Bal = player3Bal + 9;
                        player1Bal = player1Bal - 9; 
                    }
                    if (orange1 == true && player4Bankrupt == false) { //if player 4 owns property and player 1 lands on it
                        player4Bal = player4Bal + 9;
                        player1Bal = player1Bal - 9;
                    }
                }
                if (playerNumber == 2) {
                    if (blue1 == true && player1Bankrupt == false) { //if player 1 owns property and player 2 lands on it
                        player1Bal = player1Bal + 9;
                        player2Bal = player2Bal - 9;
                    }
                    if (green1 == true && player3Bankrupt == false) {  //if player 3 owns property and player 2 lands on it
                        player3Bal = player3Bal + 9;
                        player2Bal = player2Bal - 9;
                    }
                    if (orange1 == true && player4Bankrupt == false) { //if player 4 owns property and player 2 lands on it
                        player4Bal = player4Bal + 9;
                        player2Bal = player2Bal - 9;
                    }
                }
                if (playerNumber == 3) {
                    if (blue1 == true && player1Bankrupt == false) { //if player 1 owns property and player 3 lands on it
                        player1Bal = player1Bal + 9;
                        player3Bal = player3Bal - 9;
                    }
                    if (red1 == true && player2Bankrupt == false) { //if player 2 owns property and player 3 lands on it
                        player2Bal = player2Bal + 9;
                        player3Bal = player3Bal - 9;
                    }
                    if (orange1 == true && player4Bankrupt == false) { //if player 4 owns property and player 3 lands on it
                        player4Bal = player4Bal + 9;
                        player3Bal = player3Bal - 9;
                    }
                }
                if (playerNumber == 4) {
                    if (blue1 == true && player1Bankrupt == false) { //if player 1 owns property and player 4 lands on it
                        player1Bal = player1Bal + 9;
                        player4Bal = player4Bal - 9;
                    }
                    if (red1 == true && player2Bankrupt == false) { //if player 2 owns property and player 4 lands on it
                        player2Bal = player2Bal + 9;
                        player4Bal = player4Bal - 9;
                    }
                    if (green1 == true && player3Bankrupt == false) { //if player 3 owns property and player 4 lands on it
                        player3Bal = player3Bal + 9;
                        player4Bal = player4Bal - 9;
                    }
                }
                break;

            //managing rent at board position 2
            case 2:
                if (playerNumber == 1) {
                    if (red2 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 9;
                        player1Bal = player1Bal - 9;
                    }
                    if (green2 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 9;
                        player1Bal = player1Bal - 9;
                    }
                    if (orange2 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 9;
                        player1Bal = player1Bal - 9;
                    }
                }
                if (playerNumber == 2) {
                    if (blue2 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 9;
                        player2Bal = player2Bal - 9;
                    }
                    if (green2 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 9;
                        player2Bal = player2Bal - 9;
                    }
                    if (orange2 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 9;
                        player2Bal = player2Bal - 9;
                    }
                }
                if (playerNumber == 3) {
                    if (blue2 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 9;
                        player3Bal = player3Bal - 9;
                    }
                    if (red2 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 9;
                        player3Bal = player3Bal - 9;
                    }
                    if (orange2 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 9;
                        player3Bal = player3Bal - 9;
                    }
                }
                if (playerNumber == 4) {
                    if (blue2 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 9;
                        player4Bal = player4Bal - 9;
                    }
                    if (red2 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 9;
                        player4Bal = player4Bal - 9;
                    }
                    if (green2 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 9;
                        player4Bal = player4Bal - 9;
                    }
                }
                break;

            //managing community chest cards at board position 3
            case 3:
                int maxChest = 5;
                int minChest = 1;
                int chestNumber = (int) ((Math.random() * ((maxChest - minChest) + 1)) + minChest); //determining random commnity chest card from 1-5

                //position 3 community chest scenarios for player 1
                if (playerNumber == 1) {
                    if (chestNumber == 1) { //first card
                        jLabel1.setText("Community Chest: Bank Error, every player loses $10.");
                        player1Bal = player1Bal - 10; //adjusting player balances according to scenario
                        player2Bal = player2Bal - 10;
                        player3Bal = player3Bal - 10;
                        player4Bal = player4Bal - 10;
                    }
                    if (chestNumber == 2) { //second card
                        jLabel1.setText("Community Chest: It's your birthday, collect $5 from each player.");
                        player1Bal = player1Bal + 15; //adjusting player balances according to scenario
                        player2Bal = player2Bal - 5;
                        player3Bal = player3Bal - 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (chestNumber == 3) { //third card
                        jLabel1.setText("Community Chest: It's your birthday, collect $10.");
                        player1Bal = player1Bal + 10; //adjusting player balances according to scenario
                    }
                    if (chestNumber == 4) { //fourth card
                        jLabel1.setText("Community Chest: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //covering up player's last position
                        bluePos = 15;
                        g.setColor(Color.blue);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //drawing player at jail
                        player1Bal = player1Bal - 15; //adjusting player balances according to scenario
                    }
                    if (chestNumber == 5) { //fifth card
                        jLabel1.setText("Community Chest: Advance to GO, collect 50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //covering up player's last position
                        bluePos = 0;
                        g.setColor(Color.blue);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //drawing player at GO
                        player1Bal = player1Bal + 50; //adjusting player balances according to scenario
                    }
                }

                //position 3 community chest scenarios for player 2
                if (playerNumber == 2) {
                    if (chestNumber == 1) {
                        jLabel1.setText("Community Chest: Bank Error, every player loses $10.");
                        player1Bal = player1Bal - 10;
                        player2Bal = player2Bal - 10;
                        player3Bal = player3Bal - 10;
                        player4Bal = player4Bal - 10;
                    }
                    if (chestNumber == 2) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $5 from each player.");
                        player2Bal = player2Bal + 15;
                        player1Bal = player1Bal - 5;
                        player3Bal = player3Bal - 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (chestNumber == 3) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $10.");
                        player2Bal = player2Bal + 10;
                    }
                    if (chestNumber == 4) {
                        jLabel1.setText("Community Chest: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        redPos = 15;
                        g.setColor(Color.red);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        player2Bal = player2Bal - 15;
                    }
                    if (chestNumber == 5) {
                        jLabel1.setText("Community Chest: Advance to GO, collect 50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        redPos = 0;
                        g.setColor(Color.red);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        player2Bal = player2Bal + 50;
                    }
                }

                //position 3 community chest scenarios for player 3
                if (playerNumber == 3) {
                    if (chestNumber == 1) {
                        jLabel1.setText("Community Chest: Bank Error, every player loses $10.");
                        player3Bal = player1Bal - 10;
                        player2Bal = player2Bal - 10;
                        player1Bal = player3Bal - 10;
                        player4Bal = player4Bal - 10;
                    }
                    if (chestNumber == 2) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $5 from each player.");
                        player3Bal = player3Bal + 15;
                        player2Bal = player2Bal - 5;
                        player1Bal = player1Bal - 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (chestNumber == 3) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $10.");
                        player3Bal = player3Bal + 10;
                    }
                    if (chestNumber == 4) {
                        jLabel1.setText("Community Chest: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                        greenPos = 15;
                        g.setColor(Color.green);
                        g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                        player3Bal = player3Bal - 15;
                    }
                    if (chestNumber == 5) {
                        jLabel1.setText("Community Chest: Advance to GO, collect 50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                        greenPos = 0;
                        g.setColor(Color.green);
                        g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                        player3Bal = player3Bal + 50;
                    }
                }

                //position 3 community chest scenarios for player 4
                if (playerNumber == 4) {
                    if (chestNumber == 1) {
                        jLabel1.setText("Community Chest: Bank Error, every player loses $10.");
                        player1Bal = player1Bal - 10;
                        player2Bal = player2Bal - 10;
                        player3Bal = player3Bal - 10;
                        player4Bal = player4Bal - 10;
                    }
                    if (chestNumber == 2) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $5 from each player.");
                        player4Bal = player4Bal + 15;
                        player2Bal = player2Bal - 5;
                        player3Bal = player3Bal - 5;
                        player1Bal = player1Bal - 5;
                    }
                    if (chestNumber == 3) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $10.");
                        player4Bal = player4Bal + 10;
                    }
                    if (chestNumber == 4) {
                        jLabel1.setText("Community Chest: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                        orangePos = 15;
                        g.setColor(Color.orange);
                        g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                        player4Bal = player4Bal - 15;
                    }
                    if (chestNumber == 5) {
                        jLabel1.setText("Community Chest: Advance to GO, collect 50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                        orangePos = 0;
                        g.setColor(Color.orange);
                        g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                        player4Bal = player4Bal + 50;
                    }
                    break;
                }

            //managing rent at board position 4
            case 4:
                if (playerNumber == 1) {
                    if (red4 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 7;
                        player1Bal = player1Bal - 7;
                    }
                    if (green4 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 7;
                        player1Bal = player1Bal - 7;
                    }
                    if (orange4 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 7;
                        player1Bal = player1Bal - 7;
                    }
                }
                if (playerNumber == 2) {
                    if (blue4 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 7;
                        player2Bal = player2Bal - 7;
                    }
                    if (green4 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 7;
                        player2Bal = player2Bal - 7;
                    }
                    if (orange4 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 7;
                        player2Bal = player2Bal - 7;
                    }
                }
                if (playerNumber == 3) {
                    if (blue4 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 7;
                        player3Bal = player3Bal - 7;
                    }
                    if (red4 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 7;
                        player3Bal = player3Bal - 7;
                    }
                    if (orange4 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 7;
                        player3Bal = player3Bal - 7;
                    }
                }
                if (playerNumber == 4) {
                    if (blue4 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 7;
                        player4Bal = player4Bal - 7;
                    }
                    if (red4 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 7;
                        player4Bal = player4Bal - 7;
                    }
                    if (green4 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 7;
                        player4Bal = player4Bal - 7;
                    }
                }
                break;

            //GO TO JAIL
             case 5:
                if (playerNumber == 1) {
                g.setColor(Color.white);
                g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //covering up player's last position
                bluePos = 15;
                g.setColor(Color.blue);
                g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //redrawing player in jail
                player1Bal = player1Bal - 15; //taking 15 currency from player for jail
                }
                if (playerNumber == 2) {
                g.setColor(Color.white);
                g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10); //covering up player's last position
                redPos = 15;
                g.setColor(Color.red);
                g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10); //redrawing player in jail
                player2Bal = player2Bal - 15;  //taking 15 currency from player for jail
                }
                if (playerNumber == 3) {
                g.setColor(Color.white);
                g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10); //covering up player's last position
                greenPos = 15;
                g.setColor(Color.green);
                g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10); //redrawing player in jail
                player3Bal = player3Bal - 15;  //taking 15 currency from player for jail
                }
                if (playerNumber == 4) {
                g.setColor(Color.white);
                g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10); //covering up player's last position
                orangePos = 15;
                g.setColor(Color.orange);
                g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10); //redrawing player in jail
                player4Bal = player4Bal - 15;  //taking 15 currency from player for jail
                }
                break;
             
            //managing rent at board position 6
            case 6:
                if (playerNumber == 1) {
                    if (red6 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 8;
                        player1Bal = player1Bal - 8;
                    }
                    if (green6 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 8;
                        player1Bal = player1Bal - 8;
                    }
                    if (orange6 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 8;
                        player1Bal = player1Bal - 8;
                    }
                }
                if (playerNumber == 2) {
                    if (blue6 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 8;
                        player2Bal = player2Bal - 8;
                    }
                    if (green6 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 8;
                        player2Bal = player2Bal - 8;
                    }
                    if (orange6 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 8;
                        player2Bal = player2Bal - 8;
                    }
                }
                if (playerNumber == 3) {
                    if (blue6 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 8;
                        player3Bal = player3Bal - 8;
                    }
                    if (red6 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 8;
                        player3Bal = player3Bal - 8;
                    }
                    if (orange6 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 8;
                        player3Bal = player3Bal - 8;
                    }
                }
                if (playerNumber == 4) {
                    if (blue6 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 8;
                        player4Bal = player4Bal - 8;
                    }
                    if (red6 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 8;
                        player4Bal = player4Bal - 8;
                    }
                    if (green6 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 8;
                        player4Bal = player4Bal - 8;
                    }
                }
                break;

            //managing rent at board position 7
            case 7:
                if (playerNumber == 1) {
                    if (red7 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 5;
                        player1Bal = player1Bal - 5;
                    }
                    if (green7 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 5;
                        player1Bal = player1Bal - 5;
                    }
                    if (orange7 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 5;
                        player1Bal = player1Bal - 5;
                    }
                }
                if (playerNumber == 2) {
                    if (blue7 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 5;
                        player2Bal = player2Bal - 5;
                    }
                    if (green7 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 5;
                        player2Bal = player2Bal - 5;
                    }
                    if (orange7 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 5;
                        player2Bal = player2Bal - 5;
                    }
                }
                if (playerNumber == 3) {
                    if (blue7 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 5;
                        player3Bal = player3Bal - 5;
                    }
                    if (red7 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 5;
                        player3Bal = player3Bal - 5;
                    }
                    if (orange7 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 5;
                        player3Bal = player3Bal - 5;
                    }
                }
                if (playerNumber == 4) {
                    if (blue7 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (red7 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (green7 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 5;
                        player4Bal = player4Bal - 5;
                    }
                }
                break;

            //managing chance cards at board position 8
            case 8:
                int maxChance = 5;
                int minChance = 1;
                int chanceNumber = (int) ((Math.random() * ((maxChance - minChance) + 1)) + minChance); //determining random chance card from 1-5

                if (playerNumber == 1) {
                    if (chanceNumber == 1) { //first card
                        jLabel2.setText("Chance Card: Advance to GO, collect $50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //covering up player's last position
                        bluePos = 0;
                        g.setColor(Color.blue);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //drawing player at GO
                        player1Bal = player1Bal + 50; //adjusting values according to chance card scenario
                    }

                    if (chanceNumber == 2) { //second card
                        jLabel2.setText("Chance Card: Bank pays you dividend of $10.");
                        player1Bal = player1Bal + 10; //adjusting values according to chance card scenario
                    }

                    if (chanceNumber == 3) { //third card
                        jLabel2.setText("Chance Card: Bank pays you dividend of $50.");
                        player1Bal = player1Bal + 50; //adjusting values according to chance card scenario
                    }

                    if (chanceNumber == 4) {  //fourth card
                        jLabel2.setText("Chance Card: Pay a speeding fine of $20.");
                        player1Bal = player1Bal - 20; //adjusting values according to chance card scenario
                    }

                    if (chanceNumber == 5) { //fifth card
                        jLabel2.setText("Chance Card: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //covering up player's last position
                        bluePos = 15;
                        g.setColor(Color.blue);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //drawing player in jail
                        player1Bal = player1Bal - 15; //adjusting values according to chance card scenario
                    }
                }

                if (playerNumber == 2) { //same scenarios for player 2
                    if (chanceNumber == 1) {
                        jLabel2.setText("Chance Card: Advance to GO, collect $50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        redPos = 0;
                        g.setColor(Color.red);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        player2Bal = player2Bal + 50;
                    }

                    if (chanceNumber == 2) {
                        jLabel2.setText("Chance Card: Bank pays you dividend of $10.");
                        player2Bal = player2Bal + 10;
                    }

                    if (chanceNumber == 3) {
                        jLabel2.setText("Chance Card: Bank pays you dividend of $50.");
                        player2Bal = player2Bal + 50;
                    }

                    if (chanceNumber == 4) {
                        jLabel2.setText("Chance Card: Pay a speeding fine of $20.");
                        player2Bal = player2Bal - 20;
                    }

                    if (chanceNumber == 5) {
                        jLabel2.setText("Chance Card: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        redPos = 15;
                        g.setColor(Color.red);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        player2Bal = player2Bal - 15;
                    }

                    if (playerNumber == 3) { //same scenarios for player 3
                        if (chanceNumber == 1) {
                            jLabel2.setText("Chance Card: Advance to GO, collect $50.");
                            g.setColor(Color.white);
                            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                            greenPos = 0;
                            g.setColor(Color.green);
                            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                            player3Bal = player3Bal + 50;
                        }

                        if (chanceNumber == 2) {
                            jLabel2.setText("Chance Card: Bank pays you dividend of $10.");
                            player3Bal = player3Bal + 10;
                        }

                        if (chanceNumber == 3) {
                            jLabel2.setText("Chance Card: Bank pays you dividend of $50.");
                            player3Bal = player3Bal + 50;
                        }

                        if (chanceNumber == 4) {
                            jLabel2.setText("Chance Card: Pay a speeding fine of $20.");
                            player3Bal = player3Bal - 20;
                        }

                        if (chanceNumber == 5) {
                            jLabel2.setText("Chance Card: Go to jail.");
                            g.setColor(Color.white);
                            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                            greenPos = 15;
                            g.setColor(Color.green);
                            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                            player3Bal = player3Bal - 15;
                        }
                    }

                    if (playerNumber == 4) { //same scenarios for player 4
                        if (chanceNumber == 1) {
                            jLabel2.setText("Chance Card: Advance to GO, collect $50.");
                            g.setColor(Color.white);
                            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                            orangePos = 0;
                            g.setColor(Color.orange);
                            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                            player4Bal = player4Bal + 50;
                        }

                        if (chanceNumber == 2) {
                            jLabel2.setText("Chance Card: Bank pays you dividend of $10.");
                            player4Bal = player4Bal + 10;
                        }

                        if (chanceNumber == 3) {
                            jLabel2.setText("Chance Card: Bank pays you dividend of $50.");
                            player4Bal = player4Bal + 50;
                        }

                        if (chanceNumber == 4) {
                            jLabel2.setText("Chance Card: Pay a speeding fine of $20.");
                            player4Bal = player4Bal - 20;
                        }

                        if (chanceNumber == 5) {
                            jLabel2.setText("Chance Card: Go to jail.");
                            g.setColor(Color.white);
                            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                            orangePos = 15;
                            g.setColor(Color.orange);
                            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                            player4Bal = player4Bal - 15;
                        }
                    }
                    
                }
            break;
            //managing rent at board position 9
            case 9:
                if (playerNumber == 1) {
                    if (red9 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 5;
                        player1Bal = player1Bal - 5;
                    }
                    if (green9 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 5;
                        player1Bal = player1Bal - 5;
                    }
                    if (orange9 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 5;
                        player1Bal = player1Bal - 5;
                    }
                }
                if (playerNumber == 2) {
                    if (blue9 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 5;
                        player2Bal = player2Bal - 5;
                    }
                    if (green9 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 5;
                        player2Bal = player2Bal - 5;
                    }
                    if (orange9 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 5;
                        player2Bal = player2Bal - 5;
                    }
                }
                if (playerNumber == 3) {
                    if (blue9 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 5;
                        player3Bal = player3Bal - 5;
                    }
                    if (red9 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 5;
                        player3Bal = player3Bal - 5;
                    }
                    if (orange9 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 5;
                        player3Bal = player3Bal - 5;
                    }
                }
                if (playerNumber == 4) {
                    if (blue9 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (red9 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (green9 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 5;
                        player4Bal = player4Bal - 5;
                    }
                }
                break;

            //managing rent at board position 11
            case 11:
                if (playerNumber == 1) {
                    if (red11 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 2;
                        player1Bal = player1Bal - 2;
                    }
                    if (green11 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 2;
                        player1Bal = player1Bal - 2;
                    }
                    if (orange11 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 2;
                        player1Bal = player1Bal - 2;
                    }
                }
                if (playerNumber == 2) {
                    if (blue11 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 2;
                        player2Bal = player2Bal - 2;
                    }
                    if (green11 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 2;
                        player2Bal = player2Bal - 2;
                    }
                    if (orange11 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 2;
                        player2Bal = player2Bal - 2;
                    }
                }
                if (playerNumber == 3) {
                    if (blue11 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 2;
                        player3Bal = player3Bal - 2;
                    }
                    if (red11 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 2;
                        player3Bal = player3Bal - 2;
                    }
                    if (orange11 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 2;
                        player3Bal = player3Bal - 2;
                    }
                }
                if (playerNumber == 4) {
                    if (blue11 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 2;
                        player4Bal = player4Bal - 2;
                    }
                    if (red11 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 2;
                        player4Bal = player4Bal - 2;
                    }
                    if (green11 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 2;
                        player4Bal = player4Bal - 2;
                    }
                }
                break;

//managing community chest cards at board position 12
                //same card setup, different board position
            case 12:
                int maxChest2 = 5;
                int minChest2 = 1;
                int chestNumber2 = (int) ((Math.random() * ((maxChest2 - minChest2) + 1)) + minChest2);

                //position 12 chance card scenarios for player 1
                if (playerNumber == 1) {
                    if (chestNumber2 == 1) {
                        jLabel1.setText("Community Chest: Bank Error, every player loses $10.");
                        player1Bal = player1Bal - 10;
                        player2Bal = player2Bal - 10;
                        player3Bal = player3Bal - 10;
                        player4Bal = player4Bal - 10;
                    }
                    if (chestNumber2 == 2) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $5 from each player.");
                        player1Bal = player1Bal + 15;
                        player2Bal = player2Bal - 5;
                        player3Bal = player3Bal - 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (chestNumber2 == 3) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $10.");
                        player1Bal = player1Bal + 10;
                    }
                    if (chestNumber2 == 4) {
                        jLabel1.setText("Community Chest: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10);
                        bluePos = 15;
                        g.setColor(Color.blue);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10);
                        player1Bal = player1Bal - 15;
                    }
                    if (chestNumber2 == 5) {
                        jLabel1.setText("Community Chest: Advance to GO, collect 50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10);
                        bluePos = 0;
                        g.setColor(Color.blue);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10);
                        player1Bal = player1Bal + 50;
                    }
                }

                //position 12 chance card scenarios for player 2
                if (playerNumber == 2) {
                    if (chestNumber2 == 1) {
                        jLabel1.setText("Community Chest: Bank Error, every player loses $10.");
                        player1Bal = player1Bal - 10;
                        player2Bal = player2Bal - 10;
                        player3Bal = player3Bal - 10;
                        player4Bal = player4Bal - 10;
                    }
                    if (chestNumber2 == 2) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $5 from each player.");
                        player2Bal = player2Bal + 15;
                        player1Bal = player1Bal - 5;
                        player3Bal = player3Bal - 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (chestNumber2 == 3) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $10.");
                        player2Bal = player2Bal + 10;
                    }
                    if (chestNumber2 == 4) {
                        jLabel1.setText("Community Chest: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        redPos = 15;
                        g.setColor(Color.red);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        player2Bal = player2Bal - 15;
                    }
                    if (chestNumber2 == 5) {
                        jLabel1.setText("Community Chest: Advance to GO, collect 50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        redPos = 0;
                        g.setColor(Color.red);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        player2Bal = player2Bal + 50;
                    }
                }

                //position 12 chance card scenarios for player 3
                if (playerNumber == 3) {
                    if (chestNumber2 == 1) {
                        jLabel1.setText("Community Chest: Bank Error, every player loses $10.");
                        player3Bal = player1Bal - 10;
                        player2Bal = player2Bal - 10;
                        player1Bal = player3Bal - 10;
                        player4Bal = player4Bal - 10;
                    }
                    if (chestNumber2 == 2) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $5 from each player.");
                        player3Bal = player3Bal + 15;
                        player2Bal = player2Bal - 5;
                        player1Bal = player1Bal - 5;
                        player4Bal = player4Bal - 5;
                    }
                    if (chestNumber2 == 3) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $10.");
                        player3Bal = player3Bal + 10;
                    }
                    if (chestNumber2 == 4) {
                        jLabel1.setText("Community Chest: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                        greenPos = 15;
                        g.setColor(Color.green);
                        g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                        player3Bal = player3Bal - 15;
                    }
                    if (chestNumber2 == 5) {
                        jLabel1.setText("Community Chest: Advance to GO, collect 50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                        greenPos = 0;
                        g.setColor(Color.green);
                        g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                        player3Bal = player3Bal + 50;
                    }
                }

                //position 12 chance card scenarios for player 4
                if (playerNumber == 4) {
                    if (chestNumber2 == 1) {
                        jLabel1.setText("Community Chest: Bank Error, every player loses $10.");
                        player1Bal = player1Bal - 10;
                        player2Bal = player2Bal - 10;
                        player3Bal = player3Bal - 10;
                        player4Bal = player4Bal - 10;
                    }
                    if (chestNumber2 == 2) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $5 from each player.");
                        player4Bal = player4Bal + 15;
                        player2Bal = player2Bal - 5;
                        player3Bal = player3Bal - 5;
                        player1Bal = player1Bal - 5;
                    }
                    if (chestNumber2 == 3) {
                        jLabel1.setText("Community Chest: It's your birthday, collect $10.");
                        player4Bal = player4Bal + 10;
                    }
                    if (chestNumber2 == 4) {
                        jLabel1.setText("Community Chest: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                        orangePos = 15;
                        g.setColor(Color.orange);
                        g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                        player4Bal = player4Bal - 15;
                    }
                    if (chestNumber2 == 5) {
                        jLabel1.setText("Community Chest: Advance to GO, collect 50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                        orangePos = 0;
                        g.setColor(Color.orange);
                        g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                        player4Bal = player4Bal + 50;
                    }
                }

            //managing rent at board position 13
            case 13:
                if (playerNumber == 1) {
                    if (red13 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 1;
                        player1Bal = player1Bal - 1;
                    }
                    if (green13 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 1;
                        player1Bal = player1Bal - 1;
                    }
                    if (orange13 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 1;
                        player1Bal = player1Bal - 1;
                    }
                }
                if (playerNumber == 2) {
                    if (blue13 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 1;
                        player2Bal = player2Bal - 1;
                    }
                    if (green13 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 1;
                        player2Bal = player2Bal - 1;
                    }
                    if (orange13 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 1;
                        player2Bal = player2Bal - 1;
                    }
                }
                if (playerNumber == 3) {
                    if (blue13 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 1;
                        player3Bal = player3Bal - 1;
                    }
                    if (red13 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 1;
                        player3Bal = player3Bal - 1;
                    }
                    if (orange13 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 1;
                        player3Bal = player3Bal - 1;
                    }
                }
                if (playerNumber == 4) {
                    if (blue13 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 1;
                        player4Bal = player4Bal - 1;
                    }
                    if (red13 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 1;
                        player4Bal = player4Bal - 1;
                    }
                    if (green13 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 1;
                        player4Bal = player4Bal - 1;
                    }
                }
                break;

            //managing rent at board position 14
            case 14:
                if (playerNumber == 1) {
                    if (red14 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 3;
                        player1Bal = player1Bal - 3;
                    }
                    if (green14 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 3;
                        player1Bal = player1Bal - 3;
                    }
                    if (orange14 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 3;
                        player1Bal = player1Bal - 3;
                    }
                }
                if (playerNumber == 2) {
                    if (blue14 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 3;
                        player2Bal = player2Bal - 3;
                    }
                    if (green14 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 3;
                        player2Bal = player2Bal - 3;
                    }
                    if (orange14 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 3;
                        player2Bal = player2Bal - 3;
                    }
                }
                if (playerNumber == 3) {
                    if (blue14 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 3;
                        player3Bal = player3Bal - 3;
                    }
                    if (red14 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 3;
                        player3Bal = player3Bal - 3;
                    }
                    if (orange14 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 3;
                        player3Bal = player3Bal - 3;
                    }
                }
                if (playerNumber == 4) {
                    if (blue14 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 3;
                        player4Bal = player4Bal - 3;
                    }
                    if (red14 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 3;
                        player4Bal = player4Bal - 3;
                    }
                    if (green14 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 3;
                        player4Bal = player4Bal - 3;
                    }
                }
                break;

            //managing rent at board position 16
            case 16:
                if (playerNumber == 1) {
                    if (red16 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 3;
                        player1Bal = player1Bal - 3;
                    }
                    if (green16 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 3;
                        player1Bal = player1Bal - 3;
                    }
                    if (orange16 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 3;
                        player1Bal = player1Bal - 3;
                    }
                }
                if (playerNumber == 2) {
                    if (blue16 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 3;
                        player2Bal = player2Bal - 3;
                    }
                    if (green16 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 3;
                        player2Bal = player2Bal - 3;
                    }
                    if (orange16 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 3;
                        player2Bal = player2Bal - 3;
                    }
                }
                if (playerNumber == 3) {
                    if (blue16 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 3;
                        player3Bal = player3Bal - 3;
                    }
                    if (red16 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 3;
                        player3Bal = player3Bal - 3;
                    }
                    if (orange16 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 3;
                        player3Bal = player3Bal - 3;
                    }
                }
                if (playerNumber == 4) {
                    if (blue16 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 3;
                        player4Bal = player4Bal - 3;
                    }
                    if (red16 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 3;
                        player4Bal = player4Bal - 3;
                    }
                    if (green16 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 3;
                        player4Bal = player4Bal - 3;
                    }
                }
                break;

            //managing rent at board position 17
            case 17:
                if (playerNumber == 1) {
                    if (red17 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 12;
                        player1Bal = player1Bal - 12;
                    }
                    if (green17 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 12;
                        player1Bal = player1Bal - 12;
                    }
                    if (orange17 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 12;
                        player1Bal = player1Bal - 12;
                    }
                }
                if (playerNumber == 2) {
                    if (blue17 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 12;
                        player2Bal = player2Bal - 12;
                    }
                    if (green17 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 12;
                        player2Bal = player2Bal - 12;
                    }
                    if (orange17 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 12;
                        player2Bal = player2Bal - 12;
                    }
                }
                if (playerNumber == 3) {
                    if (blue17 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 12;
                        player3Bal = player3Bal - 12;
                    }
                    if (red17 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 12;
                        player3Bal = player3Bal - 12;
                    }
                    if (orange17 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 12;
                        player3Bal = player3Bal - 12;
                    }
                }
                if (playerNumber == 4) {
                    if (blue17 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 12;
                        player4Bal = player4Bal - 12;
                    }
                    if (red17 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 12;
                        player4Bal = player4Bal - 12;
                    }
                    if (green17 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 12;
                        player4Bal = player4Bal - 12;
                    }
                }
                break;

            //managing chance cards at board position 18
                //same card setup, different board position
            case 18:
                int maxChance2 = 5;
                int minChance2 = 1;
                int chanceNumber2 = (int) ((Math.random() * ((maxChance2 - minChance2) + 1)) + minChance2);

                if (playerNumber == 1) {
                    if (chanceNumber2 == 1) {
                        jLabel2.setText("Chance Card: Advance to GO, collect $50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10);
                        bluePos = 0;
                        g.setColor(Color.blue);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10);
                        player1Bal = player1Bal + 50;
                    }

                    if (chanceNumber2 == 2) {
                        jLabel2.setText("Chance Card: Bank pays you dividend of $10.");
                        player1Bal = player1Bal + 10;
                    }

                    if (chanceNumber2 == 3) {
                        jLabel2.setText("Chance Card: Bank pays you dividend of $50.");
                        player1Bal = player1Bal + 50;
                    }

                    if (chanceNumber2 == 4) {
                        jLabel2.setText("Chance Card: Pay a speeding fine of $20.");
                        player1Bal = player1Bal - 20;
                    }

                    if (chanceNumber2 == 5) {
                        jLabel2.setText("Chance Card: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10);
                        bluePos = 15;
                        g.setColor(Color.blue);
                        g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10);
                        player1Bal = player1Bal - 15;
                    }
                }

                if (playerNumber == 2) {
                    if (chanceNumber2 == 1) {
                        jLabel2.setText("Chance Card: Advance to GO, collect $50.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        redPos = 0;
                        g.setColor(Color.red);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        player2Bal = player2Bal + 50;
                    }

                    if (chanceNumber2 == 2) {
                        jLabel2.setText("Chance Card: Bank pays you dividend of $10.");
                        player2Bal = player2Bal + 10;
                    }

                    if (chanceNumber2 == 3) {
                        jLabel2.setText("Chance Card: Bank pays you dividend of $50.");
                        player2Bal = player2Bal + 50;
                    }

                    if (chanceNumber2 == 4) {
                        jLabel2.setText("Chance Card: Pay a speeding fine of $20.");
                        player2Bal = player2Bal - 20;
                    }

                    if (chanceNumber2 == 5) {
                        jLabel2.setText("Chance Card: Go to jail.");
                        g.setColor(Color.white);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        redPos = 15;
                        g.setColor(Color.red);
                        g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10);
                        player2Bal = player2Bal - 15;
                    }

                    if (playerNumber == 3) {
                        if (chanceNumber2 == 1) {
                            jLabel2.setText("Chance Card: Advance to GO, collect $50.");
                            g.setColor(Color.white);
                            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                            greenPos = 0;
                            g.setColor(Color.green);
                            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                            player3Bal = player3Bal + 50;
                        }

                        if (chanceNumber2 == 2) {
                            jLabel2.setText("Chance Card: Bank pays you dividend of $10.");
                            player3Bal = player3Bal + 10;
                        }

                        if (chanceNumber2 == 3) {
                            jLabel2.setText("Chance Card: Bank pays you dividend of $50.");
                            player3Bal = player3Bal + 50;
                        }

                        if (chanceNumber2 == 4) {
                            jLabel2.setText("Chance Card: Pay a speeding fine of $20.");
                            player3Bal = player3Bal - 20;
                        }

                        if (chanceNumber2 == 5) {
                            jLabel2.setText("Chance Card: Go to jail.");
                            g.setColor(Color.white);
                            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                            greenPos = 15;
                            g.setColor(Color.green);
                            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10);
                            player3Bal = player3Bal - 15;
                        }
                    }

                    if (playerNumber == 4) {
                        if (chanceNumber2 == 1) {
                            jLabel2.setText("Chance Card: Advance to GO, collect $50.");
                            g.setColor(Color.white);
                            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                            orangePos = 0;
                            g.setColor(Color.orange);
                            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                            player4Bal = player4Bal + 50;
                        }

                        if (chanceNumber2 == 2) {
                            jLabel2.setText("Chance Card: Bank pays you dividend of $10.");
                            player4Bal = player4Bal + 10;
                        }

                        if (chanceNumber2 == 3) {
                            jLabel2.setText("Chance Card: Bank pays you dividend of $50.");
                            player4Bal = player4Bal + 50;
                        }

                        if (chanceNumber2 == 4) {
                            jLabel2.setText("Chance Card: Pay a speeding fine of $20.");
                            player4Bal = player4Bal - 20;
                        }

                        if (chanceNumber2 == 5) {
                            jLabel2.setText("Chance Card: Go to jail.");
                            g.setColor(Color.white);
                            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                            orangePos = 15;
                            g.setColor(Color.orange);
                            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10);
                            player4Bal = player4Bal - 15;
                        }
                    }
                    break;
                }

            //managing rent at board position 19
            case 19:
                if (playerNumber == 1) {
                    if (red19 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 12;
                        player1Bal = player1Bal - 12;
                    }
                    if (green19 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 12;
                        player1Bal = player1Bal - 12;
                    }
                    if (orange19 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 12;
                        player1Bal = player1Bal - 12;
                    }
                }
                if (playerNumber == 2) {
                    if (blue19 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 12;
                        player2Bal = player2Bal - 12;
                    }
                    if (green19 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 12;
                        player2Bal = player2Bal - 12;
                    }
                    if (orange19 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 12;
                        player2Bal = player2Bal - 12;
                    }
                }
                if (playerNumber == 3) {
                    if (blue19 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 12;
                        player3Bal = player3Bal - 12;
                    }
                    if (red19 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 12;
                        player3Bal = player3Bal - 12;
                    }
                    if (orange19 == true && player4Bankrupt == false) {
                        player4Bal = player4Bal + 12;
                        player3Bal = player3Bal - 12;
                    }
                }
                if (playerNumber == 4) {
                    if (blue19 == true && player1Bankrupt == false) {
                        player1Bal = player1Bal + 12;
                        player4Bal = player4Bal - 12;
                    }
                    if (red19 == true && player2Bankrupt == false) {
                        player2Bal = player2Bal + 12;
                        player4Bal = player4Bal - 12;
                    }
                    if (green19 == true && player3Bankrupt == false) {
                        player3Bal = player3Bal + 12;
                        player4Bal = player4Bal - 12;
                    }
                }
                break;
        }     

        //refreshing player balances
        player1Balance.setText("Player 1: $" + player1Bal);
        player2Balance.setText("Player 2: $" + player2Bal);
        player3Balance.setText("Player 3: $" + player3Bal);
        player4Balance.setText("Player 4: $" + player4Bal);

        //updating player balance if bankrupt
        if (player1Bal <= 0) {
            player1Balance.setText("Player 1: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player1Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //removing player from board 
            player1Bal = 0;
        }

        if (player2Bal <= 0) {
            player2Balance.setText("Player 2: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player2Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10); //removing player from board
            player2Bal = 0;
        }

        if (player3Bal <= 0) {
            player3Balance.setText("Player 3: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player3Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10); //removing player from board
            player3Bal = 0;
        }

        if (player4Bal <= 0) {
            player4Balance.setText("Player 4: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player4Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10); //removing player from board
            player4Bal = 0;
        }
    }//GEN-LAST:event_rollButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed

//determining events of board positions (buying properties)      
        switch (boardPos) {
            //managing property ownership board position 1
            case 1:
                //determining if player is allowed to buy property
                if (playerNumber == 1 && case1Bought == false) {
                    player1Bal = player1Bal - 100;
                    case1Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue); //drawing player on property to indicate purchase
                    g.fillOval(505, 420, 10, 10);
                    blue1 = true; //indicating that player 1 (blue) owns property at position 1
                }
                //determining if player is allowed to buy property
                if (playerNumber == 2 && case1Bought == false) {
                    player2Bal = player2Bal - 100;
                    case1Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(505, 420, 10, 10);
                    red1 = true;
                }
                //determining if player is allowed to buy property
                if (playerNumber == 3 && case1Bought == false) {
                    player3Bal = player3Bal - 100;
                    case1Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(505, 420, 10, 10);
                    green1 = true;
                }
                //determining if player is allowed to buy property
                if (playerNumber == 4 && case1Bought == false) {
                    player4Bal = player4Bal - 100;
                    case1Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(505, 420, 10, 10);
                    orange1 = true;
                }
                break;

            //managing property ownership board position 2
            case 2:
                if (playerNumber == 1 && case2Bought == false) {
                    player1Bal = player1Bal - 100;
                    case2Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[2] - 60, yPos[2], 10, 10);
                    blue2 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player is allowed to buy property
                if (playerNumber == 2 && case2Bought == false) {
                    player2Bal = player2Bal - 100;
                    case2Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[2] - 60, yPos[2], 10, 10);
                    red2 = true;
                }
                //determining if player is allowed to buy property
                if (playerNumber == 3 && case2Bought == false) {
                    player3Bal = player3Bal - 100;
                    case2Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[2] - 60, yPos[2], 10, 10);
                    green2 = true;
                }
                //determining if player is allowed to buy property
                if (playerNumber == 4 && case2Bought == false) {
                    player4Bal = player4Bal - 100;
                    case2Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[2] - 60, yPos[2], 10, 10);
                    orange2 = true;
                }
                break;

            //managing property ownership board position 4
            case 4:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case4Bought == false) {
                    player1Bal = player1Bal - 87;
                    case4Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[4] - 60, yPos[4], 10, 10);
                    blue4 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case4Bought == false) {
                    player2Bal = player2Bal - 87;
                    case4Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[4] - 60, yPos[4], 10, 10);
                    red4 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case4Bought == false) {
                    player3Bal = player3Bal - 87;
                    case4Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[4] - 60, yPos[4], 10, 10);
                    green4 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case4Bought == false) {
                    player4Bal = player4Bal - 87;
                    case4Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[4] - 60, yPos[4], 10, 10);
                    orange4 = true;
                }
                break;

            case 6:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case6Bought == false) {
                    player1Bal = player1Bal - 93;
                    case6Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[6], yPos[6] + 60, 10, 10);
                    blue6 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case6Bought == false) {
                    player2Bal = player2Bal - 93;
                    case6Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[6], yPos[6] + 60, 10, 10);
                    red6 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case6Bought == false) {
                    player3Bal = player3Bal - 93;
                    case6Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[6], yPos[6] + 60, 10, 10);
                    green6 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case6Bought == false) {
                    player4Bal = player4Bal - 93;
                    case6Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[6], yPos[6] + 60, 10, 10);
                    orange6 = true;
                }
                break;

            case 7:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case7Bought == false) {
                    player1Bal = player1Bal - 60;
                    case7Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[7], yPos[7] + 60, 10, 10);
                    blue7 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case7Bought == false) {
                    player2Bal = player2Bal - 60;
                    case7Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[7], yPos[7] + 60, 10, 10);
                    red7 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case7Bought == false) {
                    player3Bal = player3Bal - 60;
                    case7Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[7], yPos[7] + 60, 10, 10);
                    green7 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case7Bought == false) {
                    player4Bal = player4Bal - 60;
                    case7Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[7], yPos[7] + 60, 10, 10);
                    orange7 = true;
                }
                break;

            case 9:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case9Bought == false) {
                    player1Bal = player1Bal - 60;
                    case9Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[9], yPos[9] + 60, 10, 10);
                    blue9 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case9Bought == false) {
                    player2Bal = player2Bal - 60;
                    case9Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[9], yPos[9] + 60, 10, 10);
                    red9 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case9Bought == false) {
                    player3Bal = player3Bal - 60;
                    case9Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[9], yPos[9] + 60, 10, 10);
                    green9 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case9Bought == false) {
                    player4Bal = player4Bal - 60;
                    case9Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[9], yPos[9] + 60, 10, 10);
                    orange9 = true;
                }
                break;

            case 11:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case11Bought == false) {
                    player1Bal = player1Bal - 33;
                    case11Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[11] + 60, yPos[11], 10, 10);
                    blue11 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case11Bought == false) {
                    player2Bal = player2Bal - 33;
                    case11Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[11] + 60, yPos[11], 10, 10);
                    red11 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case11Bought == false) {
                    player3Bal = player3Bal - 33;
                    case11Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[11] + 60, yPos[11], 10, 10);
                    green11 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case11Bought == false) {
                    player4Bal = player4Bal - 33;
                    case11Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[11] + 60, yPos[11], 10, 10);
                    orange11 = true;
                }
                break;

            case 13:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case13Bought == false) {
                    player1Bal = player1Bal - 20;
                    case13Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[13] + 60, yPos[13], 10, 10);
                    blue13 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case13Bought == false) {
                    player2Bal = player2Bal - 20;
                    case13Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[13] + 60, yPos[13], 10, 10);
                    red13 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case13Bought == false) {
                    player3Bal = player3Bal - 20;
                    case13Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[13] + 60, yPos[13], 10, 10);
                    green13 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case13Bought == false) {
                    player4Bal = player4Bal - 20;
                    case13Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[13] + 60, yPos[13], 10, 10);
                    orange13 = true;
                }
                break;

            case 14:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case14Bought == false) {
                    player1Bal = player1Bal - 47;
                    case14Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[14] + 60, yPos[14], 10, 10);
                    blue14 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case14Bought == false) {
                    player2Bal = player2Bal - 47;
                    case14Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[14] + 60, yPos[14], 10, 10);
                    red14 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case14Bought == false) {
                    player3Bal = player3Bal - 47;
                    case14Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[14] + 60, yPos[14], 10, 10);
                    green14 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case14Bought == false) {
                    player4Bal = player4Bal - 47;
                    case14Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[14] + 60, yPos[14], 10, 10);
                    orange14 = true;
                }
                break;

            case 16:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case16Bought == false) {
                    player1Bal = player1Bal - 47;
                    case16Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[16], yPos[16] - 60, 10, 10);
                    blue16 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case16Bought == false) {
                    player2Bal = player2Bal - 47;
                    case16Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[16], yPos[16] - 60, 10, 10);
                    red16 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case16Bought == false) {
                    player3Bal = player3Bal - 47;
                    case16Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[16], yPos[16] - 60, 10, 10);
                    green16 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case16Bought == false) {
                    player4Bal = player4Bal - 47;
                    case16Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[16], yPos[16] - 60, 10, 10);
                    orange16 = true;
                }
                break;

            case 17:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case17Bought == false) {
                    player1Bal = player1Bal - 117;
                    case17Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[17], yPos[17] - 60, 10, 10);
                    blue17 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case17Bought == false) {
                    player2Bal = player2Bal - 117;
                    case17Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[17], yPos[17] - 60, 10, 10);
                    red17 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case17Bought == false) {
                    player3Bal = player3Bal - 117;
                    case17Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[17], yPos[17] - 60, 10, 10);
                    green17 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case17Bought == false) {
                    player4Bal = player4Bal - 117;
                    case17Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[17], yPos[17] - 60, 10, 10);
                    orange17 = true;
                }
                break;

            case 19:
                //determining if player 1 is allowed to buy property
                if (playerNumber == 1 && case19Bought == false) {
                    player1Bal = player1Bal - 117;
                    case19Bought = true; //indicating that property has been bought
                    g.setColor(Color.blue);
                    g.fillOval(xPos[19], yPos[19] - 60, 10, 10);
                    blue19 = true; //indicating that player 1 (blue) owns the property
                }
                //determining if player 2 is allowed to buy property
                if (playerNumber == 2 && case19Bought == false) {
                    player2Bal = player2Bal - 117;
                    case19Bought = true;
                    g.setColor(Color.red);
                    g.fillOval(xPos[19], yPos[19] - 60, 10, 10);
                    red19 = true;
                }
                //determining if player 3 is allowed to buy property
                if (playerNumber == 3 && case19Bought == false) {
                    player3Bal = player3Bal - 117;
                    case19Bought = true;
                    g.setColor(Color.green);
                    g.fillOval(xPos[19], yPos[19] - 60, 10, 10);
                    green19 = true;
                }
                //determining if player 4 is allowed to buy property
                if (playerNumber == 4 && case19Bought == false) {
                    player4Bal = player4Bal - 117;
                    case19Bought = true;
                    g.setColor(Color.orange);
                    g.fillOval(xPos[19], yPos[19] - 60, 10, 10);
                    orange19 = true;
                }
                break;
        }
        //updating player balances when buy is clicked 
        player1Balance.setText("Player 1: $" + player1Bal);
        player2Balance.setText("Player 2: $" + player2Bal);
        player3Balance.setText("Player 3: $" + player3Bal);
        player4Balance.setText("Player 4: $" + player4Bal);

        //updating if bankrupt
        if (player1Bal <= 0) {
            player1Balance.setText("Player 1: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player1Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[bluePos], yPos[bluePos], 10, 10); //removing player from board 
            player1Bal = 0;
        }

        if (player2Bal <= 0) {
            player2Balance.setText("Player 2: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player2Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[redPos] + 10, yPos[redPos], 10, 10); //removing player from board
            player2Bal = 0;
        }

        if (player3Bal <= 0) {
            player3Balance.setText("Player 3: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player3Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[greenPos], yPos[greenPos] + 10, 10, 10); //removing player from board
            player3Bal = 0;
        }

        if (player4Bal <= 0) {
            player4Balance.setText("Player 4: BANKRUPT..."); //declaring player as bankrupt if they dont have money
            player4Bankrupt = true;
            g.setColor(Color.white);
            g.fillOval(xPos[orangePos] + 10, yPos[orangePos] + 10, 10, 10); //removing player from board
            player4Bal = 0;
        }
    }//GEN-LAST:event_buyButtonActionPerformed

    private void monopolyBoardMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monopolyBoardMouseMoved

    }//GEN-LAST:event_monopolyBoardMouseMoved

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MonopolyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonopolyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonopolyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonopolyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonopolyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel diceFace;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel instructions1;
    private javax.swing.JLabel instructions10;
    private javax.swing.JLabel instructions2;
    private javax.swing.JLabel instructions3;
    private javax.swing.JLabel instructions4;
    private javax.swing.JLabel instructions5;
    private javax.swing.JLabel instructions6;
    private javax.swing.JLabel instructions7;
    private javax.swing.JLabel instructions8;
    private javax.swing.JLabel instructions9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel monopolyBoard;
    private javax.swing.JLabel player1Balance;
    private javax.swing.JLabel player2Balance;
    private javax.swing.JLabel player3Balance;
    private javax.swing.JLabel player4Balance;
    private javax.swing.JLabel priceList;
    private javax.swing.JButton rollButton;
    // End of variables declaration//GEN-END:variables
}
