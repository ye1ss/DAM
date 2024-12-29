using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class DialogoTrigger : MonoBehaviour
{
    public Dialogo dialogo;
    public DialogoManager dialogoManager;

    void Update()
    {
        if ((Input.GetKeyDown(KeyCode.E) || Input.GetButtonDown("Ybtn"))&& !Input.GetKeyDown(KeyCode.Space))
        {
            TriggerDialogo();
        }
    }

    public void TriggerDialogo (){
        if(!dialogoManager.dialogoEmpezado){
            FindObjectOfType<DialogoManager>().EmpezarDialogo(dialogo);
        } else {
            FindObjectOfType<DialogoManager>().SiguienteFrase();
        }
        
    }
}
