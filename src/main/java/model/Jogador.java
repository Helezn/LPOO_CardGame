/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class Jogador {

    private int id;
    private String nickname;
    private int level;
    private List<Carta> baralho;
    
    public Jogador() {
        this.baralho = new ArrayList<>();
    }
}
