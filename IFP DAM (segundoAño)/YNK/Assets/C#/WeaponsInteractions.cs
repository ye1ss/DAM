using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class WeaponsInteractions : MonoBehaviour
{
    public GameObject hacha;
    public GameObject espada;
    public GameObject guada�a;
    private bool activoHacha = false;
    private bool activoEspada = false;
    private bool activoGuada�a = false;
    [SerializeField]
    private Animator animEspada;
    [SerializeField]
    private Animator animHacha;
    [SerializeField]
    private Animator animGuada�a;
    
    void Start()
    {
        animEspada = GetComponent<Animator>();
        animHacha = GetComponent<Animator>();
        animGuada�a = GetComponent<Animator>();
    }
    
    public void AtaqueHacha()
    {
        if (!activoEspada && !activoHacha && !activoGuada�a)
        {
            activoHacha = true;
            hacha.SetActive(true);
        }
        else
        {
            activoHacha = false;
            hacha.SetActive(false);    
        }
    }

    public void AtaqueEspada()
    {
        if (!activoEspada && !activoHacha && !activoGuada�a)
        {
            animEspada.SetBool("Atacando", false);
        }
        else
        {
            animEspada.SetBool("Atacando", true);
        }
        
        
    }
    public void AtaqueGuada�a()
    {
         if (!activoGuada�a && !activoHacha && !activoEspada)
        {
            activoGuada�a = true;
            guada�a.SetActive(true);
        }
        else
        {
            activoGuada�a = false;
            guada�a.SetActive(false);
        }
    }
    



}
