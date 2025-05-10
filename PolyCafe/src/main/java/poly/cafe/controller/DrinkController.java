/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.controller;

import poly.cafe.entity.Drink;

/**
 *
 * @author Huyen
 */
public interface DrinkController extends CrudController<Drink> {

    void fillCategories();

    void chooseFile();
}
