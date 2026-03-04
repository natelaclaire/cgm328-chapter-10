package edu.uma.cgm228.rectangledestroyer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class RectangleGame extends BaseGame
{
    public void create()
    {
        super.create();
        setActiveScreen( new LevelScreen() );
    }
}
