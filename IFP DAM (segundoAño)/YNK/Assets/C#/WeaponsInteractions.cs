using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class WeaponsInteractions : MonoBehaviour
{
    public GameObject hacha;
    public GameObject espada;
    public GameObject guadaña;
    private bool activoHacha = false;
    private bool activoEspada = false;
    private bool activoGuadaña = false;
    [SerializeField]
    private Animator animEspada;
    [SerializeField]
    private Animator animHacha;
    [SerializeField]
    private Animator animGuadaña;
    
    void Start()
    {
        animEspada = GetComponent<Animator>();
        animHacha = GetComponent<Animator>();
        animGuadaña = GetComponent<Animator>();
    }
    
    public void AtaqueHacha()
    {
        if (!activoEspada && !activoHacha && !activoGuadaña)
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
        if (!activoEspada && !activoHacha && !activoGuadaña)
        {
            animEspada.SetBool("Atacando", false);
        }
        else
        {
            animEspada.SetBool("Atacando", true);
        }
        
        
    }
    public void AtaqueGuadaña()
    {
         if (!activoGuadaña && !activoHacha && !activoEspada)
        {
            activoGuadaña = true;
            guadaña.SetActive(true);
        }
        else
        {
            activoGuadaña = false;
            guadaña.SetActive(false);
        }
    }
    



}
