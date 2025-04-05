package com.mertrasna.vocablante;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class VocablanteGame extends Game {
    @Override
    public void create() {
        setScreen(new FirstScreen());
    }
}