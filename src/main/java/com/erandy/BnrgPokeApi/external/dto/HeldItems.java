/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erandy.BnrgPokeApi.external.dto;

import java.util.ArrayList;
import lombok.Data;

/**
 *
 * @author w10
 */

@Data
public class HeldItems {

    private Item item;
    private ArrayList<VersionDetail> version_details;

}
