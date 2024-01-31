package com.abusiness.contactosbd

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHander(context:Context) : SQLiteOpenHelper( context, DATABASE_NAME, null, DATAVASE_VERSION){
    companion object{  // todo para no tener que instanciar la clase con variables, es como una clase dentro de otra clase
        //todo accedes a sus propiedades sin instanciarla
        private const val DATABASE_NAME = "MyDataBase"
        private const val DATAVASE_VERSION = 1
        private const val TABLE_NAME ="Contacts"
        private const val KEY_ID ="id"
        private const val KEY_NAME = "nombre"
        private const val KEY_EMAIL = "email"
    }

    override fun onCreate(db: SQLiteDatabase?) {  //todo el interrogante es para no tener que preguntar si la bd es nula o no
        val createTable = ("CREATE TABLE $TABLE_NAME($KEY_ID INTEGER PRIMARY KEY, $KEY_NAME TEXT, $KEY_EMAIL TEXT)")
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) { // todo esto es para que borre la vieja
        // todo y crea una nueva con todo lo anterior incrementando la version
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun addContact(name:String, email:String):Long{
        val db = this.writableDatabase  // todo esto abre la base de datos en ese momento abierta
        val values = ContentValues()  // todo crea un conjunto / listas / pares  de valores
        values.put (KEY_NAME,name)
        values.put (KEY_EMAIL,email)
        val success = db.insert(TABLE_NAME,null, values) // todo por si acaso no pone valores se pone el null
        db.close()
             return  (success) // todo retorna el valor del exito o el fracos del que programa esta cachimba
    }  // fin addContact
}   // fin main