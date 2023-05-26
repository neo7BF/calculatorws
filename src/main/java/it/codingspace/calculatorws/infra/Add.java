//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.05.26 alle 01:45:06 AM CEST 
//


package it.codingspace.calculatorws.infra;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="intB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Add")
public class Add {

    protected int intA;
    protected int intB;

    /**
     * Recupera il valore della proprietà intA.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Imposta il valore della proprietà intA.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Recupera il valore della proprietà intB.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Imposta il valore della proprietà intB.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}
