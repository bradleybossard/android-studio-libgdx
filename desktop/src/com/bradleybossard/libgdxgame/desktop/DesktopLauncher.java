package com.bradleybossard.libgdxgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bradleybossard.libgdxgame.MainActivity;

//import sun.jvm.hotspot3.HelloWorld;

public class DesktopLauncher {
    /*
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MainActivity(), config);
	}
    */


    //public class Main {
        public static void main(String[] args) {
            LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
            cfg.title = "hello-world";
            //cfg.useGL30 = true;
            //cfg.useGL20 = false;
            cfg.width = 480;
            cfg.height = 320;

            //new LwjglApplication(new HelloWorld(), cfg);
            new LwjglApplication(new MainActivity(), cfg);

        }
    //}

}
