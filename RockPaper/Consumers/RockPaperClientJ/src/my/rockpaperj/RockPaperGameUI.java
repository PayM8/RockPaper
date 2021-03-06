/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.rockpaperj;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author kmarais
 */
public class RockPaperGameUI extends javax.swing.JFrame {

    private String teamId;
    private JGame theGame;
    private javax.swing.Timer checkTurnTimer;
    private static final int SLEEP_INTERVAL = 1000;
    private ActionListener timerAction;
    /**
     * Creates new form RockPaperGameUI
     */
    public RockPaperGameUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TeamNameField = new javax.swing.JTextField();
        RegisterTeamCommand = new javax.swing.JButton();
        RegisterTeamOutcome = new javax.swing.JLabel();
        isRegistered = new javax.swing.JCheckBox();
        GameStatus = new javax.swing.JPanel();
        JoinGameCommand = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OpposingTeamName = new javax.swing.JTextField();
        GameState = new javax.swing.JLabel();
        PlayAgainstSimulator = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        CheckMyTurnCommand = new javax.swing.JButton();
        EnableAutoRefresh = new javax.swing.JCheckBox();
        PlayHandCommand = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoundResultsTable = new javax.swing.JTable();
        UseRestfulServices = new javax.swing.JCheckBox();
        InActiveGame = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Team Name");

        TeamNameField.setToolTipText("Enter team name");

        RegisterTeamCommand.setText("Register Team");
        RegisterTeamCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterTeamCommandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RegisterTeamCommand)
                        .addGap(18, 18, 18)
                        .addComponent(RegisterTeamOutcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TeamNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TeamNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterTeamCommand)
                    .addComponent(RegisterTeamOutcome))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        isRegistered.setText("Registered");
        isRegistered.setEnabled(false);

        GameStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JoinGameCommand.setText("Join Game");
        JoinGameCommand.setEnabled(false);
        JoinGameCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinGameCommandActionPerformed(evt);
            }
        });

        jLabel4.setText("Competing Team");

        OpposingTeamName.setEditable(false);
        OpposingTeamName.setText("<none>");

        PlayAgainstSimulator.setText("Play against simulator");

        javax.swing.GroupLayout GameStatusLayout = new javax.swing.GroupLayout(GameStatus);
        GameStatus.setLayout(GameStatusLayout);
        GameStatusLayout.setHorizontalGroup(
            GameStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GameState, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameStatusLayout.createSequentialGroup()
                .addGroup(GameStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GameStatusLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(JoinGameCommand, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PlayAgainstSimulator)
                        .addGap(0, 222, Short.MAX_VALUE))
                    .addGroup(GameStatusLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(GameStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GameStatusLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(OpposingTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        GameStatusLayout.setVerticalGroup(
            GameStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GameStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JoinGameCommand)
                    .addComponent(PlayAgainstSimulator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GameState)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GameStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(OpposingTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CheckMyTurnCommand.setText("Is it my turn?");
        CheckMyTurnCommand.setEnabled(false);
        CheckMyTurnCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMyTurnCommandActionPerformed(evt);
            }
        });

        EnableAutoRefresh.setText("Auto Refresh");
        EnableAutoRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnableAutoRefreshActionPerformed(evt);
            }
        });

        PlayHandCommand.setText("Play Hand");
        PlayHandCommand.setEnabled(false);
        PlayHandCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayHandCommandActionPerformed(evt);
            }
        });

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        RoundResultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Round", "My Hand", "Opponents Hand", "Winning Team"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RoundResultsTable);
        if (RoundResultsTable.getColumnModel().getColumnCount() > 0) {
            RoundResultsTable.getColumnModel().getColumn(0).setResizable(false);
            RoundResultsTable.getColumnModel().getColumn(1).setResizable(false);
            RoundResultsTable.getColumnModel().getColumn(2).setResizable(false);
            RoundResultsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PlayHandCommand)
                .addGap(201, 201, 201))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(CheckMyTurnCommand)
                        .addGap(30, 30, 30)
                        .addComponent(EnableAutoRefresh))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckMyTurnCommand)
                    .addComponent(EnableAutoRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayHandCommand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        UseRestfulServices.setLabel("Use REST services");

        InActiveGame.setText("In Active Game");
        InActiveGame.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UseRestfulServices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(isRegistered)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GameStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(292, 292, 292)
                                    .addComponent(InActiveGame)
                                    .addGap(101, 101, 101))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isRegistered)
                    .addComponent(UseRestfulServices))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InActiveGame)
                .addGap(7, 7, 7)
                .addComponent(GameStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTimer(){
    timerAction = new ActionListener() {
      @Override public void actionPerformed(ActionEvent evt) {
        CheckIfItIsMyTurn();
      }
    };    
    
    checkTurnTimer = new javax.swing.Timer(SLEEP_INTERVAL, timerAction);
    checkTurnTimer.start();    
  }
    
    private void stopTimer(){
        checkTurnTimer.stop(); //stops notifying registered listeners
        checkTurnTimer.removeActionListener(timerAction); //removes the one registered listener
        timerAction = null;
        checkTurnTimer = null;
      }
    
    private void RegisterTeamCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterTeamCommandActionPerformed
        
        IGameProvider provider;
        
        provider = new GameProvider(UseRestfulServices.isSelected());
                
            
        TeamResult team = provider.RegisterTeam(TeamNameField.getText());
        if(team.getIsRegistered())
        {
            isRegistered.setSelected(true);
            RegisterTeamOutcome.setText("Registered OK");
            teamId = team.getId();
            JoinGameCommand.setEnabled(true);
        }
        else
        {
            teamId = "";
            isRegistered.setSelected(false);
            RegisterTeamOutcome.setText(team.getErrorReason());
            JoinGameCommand.setEnabled(false);
        }
    }//GEN-LAST:event_RegisterTeamCommandActionPerformed

    private void ClearGameState()
    {
        OpposingTeamName.setText("");
        GameState.setText("");
    }
    
    private void DisplayGameState()
    {
        String myTeamNumber = "Team 1";
        boolean amPlayer1 = true;
        String opponentName;
        
        if(this.theGame.getTeamName1().matches(TeamNameField.getText()))
        {
            opponentName = this.theGame.getTeamName2();
        }
        else
        {
            myTeamNumber = "Team 2";
            amPlayer1 = false;
            opponentName = this.theGame.getTeamName1();
        }
        OpposingTeamName.setText(opponentName);
        String theGameState = "Waiting for Players";
        
        switch(this.theGame.getState())
        {
            case Complete:
                theGameState = "Game completed.";
                break;
            case Player1Hand:
                if(amPlayer1)
                {
                    theGameState = "Waiting for you to play.";
                    PlayHandCommand.setEnabled(true);
                }
                else
                {
                    theGameState = String.format("Waiting for %1$s to play", opponentName);
                    PlayHandCommand.setEnabled(false);
                }
                
                break;
            case Player2Hand:
                if(amPlayer1)
                {
                    theGameState = String.format("Waiting for %1$s to play", opponentName);
                    PlayHandCommand.setEnabled(false);
                }
                else
                {
                    theGameState = "Waiting for you to play.";
                    PlayHandCommand.setEnabled(true);
                }
                break;
        }

        GameState.setText(String.format("You are %1$s  - %2$s", myTeamNumber, theGameState));
    }
    
    private void DisplayRoundsData(List<JRound> rounds) {
      
       List<RoundDisplay> result = new ArrayList<RoundDisplay>();
        
       for (ListIterator<JRound> it = rounds.listIterator(); it.hasNext(); ) 
       {
           JRound jround = it.next();
           RoundDisplay rd = new RoundDisplay();
           boolean amTeamOne = this.theGame.getTeamName1().matches(TeamNameField.getText());
           if(amTeamOne)
           {
               rd.setMyHand(jround.getTeam1Hand());
               rd.setOpponentHand(jround.getTeam2Hand());
           }
           else
           {
               rd.setMyHand(jround.getTeam2Hand());
               rd.setOpponentHand(jround.getTeam1Hand());
           }
           switch(jround.getResult())
            {
                 case NotComplete:
                     rd.setOutcome("Busy");
                     break;
                 case Team1Won:
                     if(amTeamOne)
                     {
                         rd.setOutcome(String.format("%1$s Won", TeamNameField.getText()));
                     }
                     else
                     {
                         rd.setOutcome(String.format("%1$s Won", OpposingTeamName.getText()));
                     }
                     break;
                 case Team2Won:
                     if(amTeamOne)
                     {
                         rd.setOutcome(String.format("%1$s Won", OpposingTeamName.getText()));
                     }
                     else
                     {
                         rd.setOutcome(String.format("%1$s Won", TeamNameField.getText()));
                     }
                     break;
                 case Draw:
                     rd.setOutcome("Draw");
                     break;
            }
           rd.setRound(jround.getRoundNumber());
           result.add(rd);
       }
        RoundsTableModel model = new RoundsTableModel(result);
      RoundResultsTable.setModel(model);
        
    }
   
     
    private void JoinGameCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinGameCommandActionPerformed
        IGameProvider provider;
        
        provider = new GameProvider(UseRestfulServices.isSelected());
        
        JGame myGame = provider.JoinGame(this.teamId, PlayAgainstSimulator.isSelected());

        RefreshStatus(myGame);
    }//GEN-LAST:event_JoinGameCommandActionPerformed

    private void CheckMyTurnCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMyTurnCommandActionPerformed
        CheckIfItIsMyTurn();
    }//GEN-LAST:event_CheckMyTurnCommandActionPerformed

    private void CheckIfItIsMyTurn()
    {
        if(this.theGame == null)
        {
            this.stopTimer();
            CheckMyTurnCommand.setEnabled(false);
            PlayHandCommand.setEnabled(false);
            return;
        }
        
        IGameProvider provider;
        provider = new GameProvider(UseRestfulServices.isSelected());
        JGame myGame = provider.UpdateGameState(this.theGame.getId());

        RefreshStatus(myGame);
    }
    
    private void RefreshStatus(JGame myGame)
    {
        if(myGame.isIsInGame())
        {
            CheckMyTurnCommand.setEnabled(true);
            this.theGame = myGame;
            InActiveGame.setSelected(true);
            DisplayGameState();
        }
        else
        {
            ClearGameState();
            CheckMyTurnCommand.setEnabled(false);
            InActiveGame.setSelected(false);
            this.theGame = null;
        }
    }
    
    private void PlayHandCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayHandCommandActionPerformed
        
        if(this.theGame == null)
        {
            this.stopTimer();
            CheckMyTurnCommand.setEnabled(false);
            PlayHandCommand.setEnabled(false);
            return;
        }
        
        IGameProvider provider;
        provider = new GameProvider(UseRestfulServices.isSelected());
        
        try
        {
            List<JRound> rounds = provider.PlayHand(this.theGame.getId(), this.teamId);
            DisplayRoundsData(rounds);
        }
        catch(Exception ex)
        {
            //TODO:
        }
    }//GEN-LAST:event_PlayHandCommandActionPerformed

    private void EnableAutoRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnableAutoRefreshActionPerformed
        if(EnableAutoRefresh.isSelected())
        {
            startTimer();
        }
        else
        {
            stopTimer();
        }
    }//GEN-LAST:event_EnableAutoRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(RockPaperGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RockPaperGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RockPaperGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RockPaperGameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RockPaperGameUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckMyTurnCommand;
    private javax.swing.JCheckBox EnableAutoRefresh;
    private javax.swing.JLabel GameState;
    private javax.swing.JPanel GameStatus;
    private javax.swing.JCheckBox InActiveGame;
    private javax.swing.JButton JoinGameCommand;
    private javax.swing.JTextField OpposingTeamName;
    private javax.swing.JCheckBox PlayAgainstSimulator;
    private javax.swing.JButton PlayHandCommand;
    private javax.swing.JButton RegisterTeamCommand;
    private javax.swing.JLabel RegisterTeamOutcome;
    private javax.swing.JTable RoundResultsTable;
    private javax.swing.JTextField TeamNameField;
    private javax.swing.JCheckBox UseRestfulServices;
    private javax.swing.JCheckBox isRegistered;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
