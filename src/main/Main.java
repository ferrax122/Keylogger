/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/**
 *
 * @author Antonio
 */
public class Main implements NativeKeyListener {
    
    public static void main(String[] args) {
        
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
        
        GlobalScreen.addNativeKeyListener(new Main());
        
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println("Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));

    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
                System.out.println("Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));


    }
    
        @Override
        public void nativeKeyTyped(NativeKeyEvent arg0) {
            
    }

    
}
