import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javazoom.jl.player.Player;
import javafx.util.Duration;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class musicplayer extends javax.swing.JFrame {
 
    ArrayList<Song> al = new ArrayList<>();
    mytablemodel tm;
    String a,c,selectedcat;
    MediaPlayer player;
    Media media;
    public Player playmp3;
    int i,n,sa,k;
    double currentvol;
    Duration songtotallength,pauselocation;
    double vol=0.7;
    
        
    
    

    public musicplayer(String selectedcat) {
        
        initComponents();
        this.selectedcat=selectedcat;
        final JFXPanel fxPanel=new JFXPanel();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = d.width;
        int h = d.height;
        setSize(d);
        setLocationRelativeTo(null);
        setResizable(false);
        jLabel1.setText(selectedcat);
        slide.setEnabled(false);
        bars.setMaximum(200);
        table.getTableHeader().setVisible(false);
        tm = new musicplayer.mytablemodel();
        table.setModel(tm);
        table.setOpaque(false);
        jLabel2.setEnabled(false);
        ((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        table.setShowGrid(false);
        getallpunsongs();
        
        
        
    }

    musicplayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resume = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        next = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        slide = new javax.swing.JSlider();
        bars = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 733));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        resume.setForeground(new java.awt.Color(255, 255, 255));
        resume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background and icons/Webp.net-resizeimage (1).png"))); // NOI18N
        resume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resumeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                resumeMouseReleased(evt);
            }
        });
        getContentPane().add(resume);
        resume.setBounds(620, 640, 60, 60);

        jScrollPane1.setOpaque(false);

        table.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        table.setOpaque(false);
        table.setRowHeight(30);
        table.setRowMargin(3);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 50, 910, 490);

        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background and icons/Webp.net-resizeimage (3).png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextMouseReleased(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(740, 640, 60, 60);

        previous.setForeground(new java.awt.Color(255, 255, 255));
        previous.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background and icons/Webp.net-resizeimage (2).png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                previousMouseReleased(evt);
            }
        });
        getContentPane().add(previous);
        previous.setBounds(500, 640, 60, 60);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 130, 150, 50);

        slide.setForeground(new java.awt.Color(255, 255, 255));
        slide.setMaximum(10);
        slide.setValue(7);
        slide.setOpaque(false);
        slide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideStateChanged(evt);
            }
        });
        getContentPane().add(slide);
        slide.setBounds(920, 660, 140, 26);

        bars.setBackground(new java.awt.Color(255, 255, 255));
        bars.setForeground(new java.awt.Color(255, 255, 255));
        bars.setMaximum(0);
        bars.setOpaque(false);
        bars.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barsStateChanged(evt);
            }
        });
        getContentPane().add(bars);
        bars.setBounds(200, 560, 910, 26);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background and icons/Webp.net-resizeimage (5).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1080, 660, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background and icons/arrow-left-48.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 50, 48, 48);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\Webp.net-resizeimage (9).jpg")); // NOI18N
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 1500, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resumeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resumeMouseReleased
        try {    
            pause();
        } catch (InterruptedException ex) {
            Logger.getLogger(musicplayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resumeMouseReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
           if(evt.getClickCount()==1)
           {
               if(table.getSelectedRow()== -1)
               {
                
               }
               else
               {
                   i=table.getSelectedRow();
                   System.out.println(i);
                   c =al.get(i).Songname;
                   stop();
                   playpunmusic();
                   System.out.println("nikhil");
               }
           }
    }//GEN-LAST:event_tableMouseClicked

    private void resumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resumeMouseClicked
       
                 
    }//GEN-LAST:event_resumeMouseClicked

    private void nextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseReleased
        next();
    }//GEN-LAST:event_nextMouseReleased

    private void previousMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseReleased
        previous();
    }//GEN-LAST:event_previousMouseReleased

    private void slideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideStateChanged
        double p=slide.getValue();
        vol=p/10;
        player.setVolume(vol);
        
    }//GEN-LAST:event_slideStateChanged

    private void barsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barsStateChanged
        
        
    }//GEN-LAST:event_barsStateChanged

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased

        if(slide.getValue()!=0)
        {
            currentvol=vol;
            slide.setValue(0);
            player.setVolume(0);
        }
        else
        {
            
            slide.setValue((int) (currentvol*10));
            player.setVolume(currentvol);
            
        }
       
        
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
       new MusicCategory().setVisible(true);
       if(player!=null)
       {
          player.stop(); 
       }
       
    }//GEN-LAST:event_jLabel3MouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                   new musicplayer().setVisible(true);
               }
           });
       } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
           Logger.getLogger(musicplayer.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JSlider bars;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel next;
    private javax.swing.JLabel previous;
    private javax.swing.JLabel resume;
    private javax.swing.JSlider slide;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    private void getallpunsongs()
    {
       al.clear();
        try {
            HttpResponse<String> response=Unirest.get(GlobalData.hostname+"/getallpunsongs")
                    .queryString("Category", selectedcat)
                    .asString();
            String ans = response.getBody();
            System.out.println(ans);
            StringTokenizer st = new StringTokenizer(ans, "~~");
            while (st.hasMoreTokens()) {
                String row = st.nextToken();
                StringTokenizer col = new StringTokenizer(row, ";;");
                String Songname = col.nextToken();
                String Songpath = col.nextToken();
                String Posterpath = col.nextToken();
                al.add(new Song(Songname,Songpath,Posterpath));
       }
             } catch (Exception ex) {
            Logger.getLogger(musicplayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    private void playpunmusic() {
        try 
        {
            HttpResponse<String> response = Unirest.get(GlobalData.hostname + "/playpun")
                   .queryString("Songname",c)
                   .asString();
            a=response.getBody();
            System.out.println(a);
            
        try
        {
             
             String path=new File(a).getAbsolutePath();
             media=new Media(new File(path).toURI().toString());
             player=new MediaPlayer(media);
             slide.setEnabled(true);
             jLabel2.setEnabled(true);
             Thread.sleep(200);
             resume.setIcon(new ImageIcon("src/background and icons/Webp.net-resizeimage(4).png"));
             bar();
             
             new Thread()
            {
              @Override
              public void run()
              {
                  player.setVolume(vol);
                  player.play();
              }
            }.start();
            
        } catch (InterruptedException ex) 
            {
                Logger.getLogger(musicplayer.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        } catch (UnirestException ex) 
        {
           Logger.getLogger(musicplayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void pause() throws InterruptedException
        {
            
            if(player!=null)
            {
                pauselocation=player.getCurrentTime();
                player.stop();
                resume.setIcon(new ImageIcon("src/background and icons/Webp.net-resizeimage (1).png"));
                sa=n--;
                k=(int) songtotallength.toSeconds();
                player=null;
                     
            }
            else
            {
                String path=new File(a).getAbsolutePath();
                media=new Media(new File(path).toURI().toString());
                player=new MediaPlayer(media);
                
                n=sa;
                resume.setIcon(new ImageIcon("src/background and icons/Webp.net-resizeimage(4).png"));
                bar();
                new Thread()
                {
                    @Override
                    public void run()
                    {
                        player.setStartTime(pauselocation);
                        player.play();
                    }
                    
                }.start();
            }
        }
        
    
    public void next()  
        {
            if(i!=table.getRowCount()-1)
            {
              i++;
                
            }
            c=al.get(i).Songname;
            stop();
            playpunmusic();
        }
    
    public void previous() 
        {
            if(i!=0)
            {
              i--;  
            }
            c=al.get(i).Songname;
            stop();
            playpunmusic();
        }

    private void stop() 
    {
         if(player!=null)
            {
              bars.setValue(0);
              n=0;
              player.stop();
            }
    }
    
    
    
    public void bar() throws InterruptedException
    {
        Thread.sleep(200);
        songtotallength=player.getTotalDuration();
        System.out.println(songtotallength);
        
        new Thread()
        {
            @Override
            public void run()
            {
                bars.setMaximum((int) songtotallength.toSeconds());
                System.out.println("nik");
                for(k=0;k<(int) songtotallength.toSeconds();k++)
                {
                    try {
                        bars.setValue(n);
                        n++;
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(musicplayer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
    
    class mytablemodel extends AbstractTableModel 
    {

        @Override
        public int getRowCount() {
           return al.size();
        }

        @Override
        public int getColumnCount() {
            return 1;
        }
        @Override
        public String getColumnName(int j) {
            String col[] = {""};
            return col[j];
        }

        @Override
        public Object getValueAt(int i, int j) {
             switch(j)
             {
               case(0):
                   return al.get(i).Songname;
             }
            return null;
        }
    }
}

