using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using TMPro;

public class DialogoManager : MonoBehaviour
{
    public TextMeshProUGUI  nombreTexto;
    public TextMeshProUGUI  dialogoText;
    public Animator anim;
    public bool isOpen;
    public bool dialogoEmpezado;
    private Queue<string> frases;
    private float velocidadEscritura = 0.03f;

    void Start()
    {
        frases = new Queue<string>();
    }

    public void EmpezarDialogo (Dialogo dialogo)
    {
        anim.SetBool("isOpen", true);
        isOpen = true;
        dialogoEmpezado = true;
        nombreTexto.text = dialogo.nombre;
        frases.Clear();
        foreach(string frase in dialogo.frases){
            frases.Enqueue(frase);
        }

        SiguienteFrase();
    }

    public void SiguienteFrase(){
        if(frases.Count == 0){
            AcabarDialogo();
            return;
        }
        string frase = frases.Dequeue();
        StopAllCoroutines();
        StartCoroutine(EscribirFrase(frase));
    }

    IEnumerator EscribirFrase(string frase){
        dialogoText.text = "";
        foreach (char c in frase.ToCharArray()){
            dialogoText.text += c;
            yield return new WaitForSeconds(velocidadEscritura);
        }
    }

    void AcabarDialogo(){
        anim.SetBool("isOpen", false);
        isOpen = false;
        dialogoEmpezado = false;
    }
}
