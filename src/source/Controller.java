package source;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.media.Media;
import javafx.beans.property.DoubleProperty;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller implements Initializable {
    @FXML
    private MediaView mv;
    MediaPlayer mp;
    Media me;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // List files in directory
        File file = new File("C:src/gifs");
        String[] str = file.list();
        // store path to a string
        String path = new File("src/gifs/video.mp4").getAbsolutePath();
        // takes source of files
        me = new Media(new File(path).toURI().toString());
        mp = new MediaPlayer(me);
        mv.setMediaPlayer(mp);
        mp.setAutoPlay(true);
        mp.setCycleCount(100000);

        DoubleProperty width = mv.fitWidthProperty();
        DoubleProperty height = mv.fitHeightProperty();
        width.bind(Bindings.selectDouble(mv.sceneProperty(), "width")); // media view select property and name of peroperty
        height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
        }

        public void openLink1(ActionEvent event){
            Desktop d = Desktop.getDesktop();
            System.out.println("Opening link 1");
            try {
                d.browse(new URI("https://path.blue/404/"));
            } catch (URISyntaxException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        public void openLink2(ActionEvent event){
            Desktop d = Desktop.getDesktop();
            System.out.println("Opening link 2");
            try {
                d.browse(new URI("https://www.facebook.com/myuoit/"));
            } catch (URISyntaxException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    public void openLink3(ActionEvent event){
        Desktop d = Desktop.getDesktop();
        System.out.println("Opening link 3");
        try {
            d.browse(new URI("https://www.instagram.com/uoit/?hl=en"));
        } catch (URISyntaxException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void openLink4(ActionEvent event){
        Desktop d = Desktop.getDesktop();
        System.out.println("Opening link 4");
        try {
            d.browse(new URI("https://twitter.com/UOIT?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"));
        } catch (URISyntaxException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void openLink5(ActionEvent event){
        Desktop d = Desktop.getDesktop();
        System.out.println("Opening link 5");
        try {
            d.browse(new URI("https://www.youtube.com/user/UOIT"));
        } catch (URISyntaxException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void openLink6(ActionEvent event){
        Desktop d = Desktop.getDesktop();
        System.out.println("Opening link 6");
        try {
            d.browse(new URI("https://itsc.uoit.ca/services/ITServiceDesk.php"));
        } catch (URISyntaxException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

