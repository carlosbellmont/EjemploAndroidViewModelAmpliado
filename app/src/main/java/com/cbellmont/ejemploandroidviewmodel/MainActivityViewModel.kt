package com.cbellmont.ejemploandroidviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay


class MainActivityViewModel  : ViewModel() {

    val films = mutableListOf<Film>()

    fun downloadFilms() {
        films.addAll(mutableListOf(
            Film(1, "La Amenaza Fantasma", "aaaa"),
            Film(2, "El Ataque de los Clones", "aaaa"),
            Film(3, "La Venganza de los Sith", "aaaa"),
            Film(4, "Una Nueva Esperanza", "aaaa"),
            Film(5, "El Imperio Contraataca", "aaaa"),
            Film(6, "El Retorno del Jedi", "aaaa"),
            Film(7, "El Despertar de la Fuerza", "aaaa"),
            Film(8, "Los Útimos Jedi", "aaaa"),
            Film(9, "El Ascenso de Skywalker", "aaaa")
        ))
    }

    fun download1to3() : List<Film> {
        return films.subList(0,3)
    }
    fun download4to6() : List<Film> {
        return films.subList(3,6)
    }
    fun download7to9() : List<Film> {
        return films.subList(6,9)
    }
}