/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo.formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Alberto
 */
public class Forma extends Polygon {

    public Color color = null;
    public boolean relleno = false;
    //coordenadas dentro de la forma
    public int x = 0;
    public int y = 0;

    public Forma(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(new int[_lados], new int[_lados], _lados);
        this.x = _posX;
        this.y = _posY;

        color = _color;
        relleno = _relleno;
    }

    public void Dibujate(Graphics2D g2, int _posX, int _posY) {
        calculaVertices(y - _posY, x - _posX);
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }

    public void calculaVertices(int _radio, double _giro) {

    }
}
