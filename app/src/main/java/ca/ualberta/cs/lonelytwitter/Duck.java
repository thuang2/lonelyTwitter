package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Duck extends Animal {
    @Override
    public void swim() {
        Log.d("shaiful", "Hey I love swimming");
    }

    public void fly(){
        Log.d("shaiful","I love flying");
    }
}

