/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;
import Banco.Cuenta;
/**
 *
 * @author Antonio Matias
 */
public class Debito extends Cuenta{
    private int iddebito;
    private float saldo;
    private int nip;

    public Debito(int iddebito, float saldo, int nip, String nombre, String paterno, String materno, String domicilio, int telefono) {
        super(nombre, paterno, materno, domicilio, telefono);
        this.iddebito = iddebito;
        this.saldo = saldo;
        this.nip = nip;
    }
    
    
}

