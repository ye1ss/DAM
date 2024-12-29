using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using TMPro;

public class PlayerInteractions : MonoBehaviour
{
    private Rigidbody2D rb;
    private SpriteRenderer sR;
    public Color colorDaño = Color.red;
    public int vidaMax = 100;
    private int vidaActual;
    public VidaController barravida;
    private int monedas = 0;
    public TMP_Text monedasText;
    public WeaponsInteractions wInteract;


    void Start()
    {
        sR = GetComponent<SpriteRenderer>();
        rb = GetComponent<Rigidbody2D>();
        vidaActual = vidaMax;
        barravida.setVidaMaxima(vidaActual);

    }

    void Update()
    {

        if (Input.GetKeyDown(KeyCode.J) || Input.GetButtonDown("Xbtn"))
        {
            wInteract.AtaqueHacha();
        }
        if (Input.GetKeyDown(KeyCode.E)|| Input.GetButtonDown("Ybtn"))
        {
            Debug.Log("Interactuar");
        }
        if (Input.GetKeyDown(KeyCode.L)|| Input.GetButtonDown("RBbtn"))
        {
            wInteract.AtaqueGuadaña();
        }
        if (Input.GetKeyDown(KeyCode.K) || Input.GetButtonDown("LBbtn"))
        {
            wInteract.AtaqueEspada();
        }
    }

    void CambiarColor(Color color)
    {
        Material nuevoMaterial = new Material(sR.sharedMaterial);
        nuevoMaterial.color = color;
        sR.material = nuevoMaterial;
    }

    public void RecibeDaño(int dañoRecibido)
    {
        if (vidaActual > 0)
        {
            vidaActual -= dañoRecibido;
            //Debug.Log("Tamaño Slider: " + barravida.slider.maxValue);
            barravida.cambiarVida(vidaActual);
            CambiarColor(colorDaño);

            if (vidaActual <= 0)
            {
                Muerte();
            }
            else
            {
                Invoke("ResetColor", 0.2f);
            }
        }
    }

    void Muerte()
    {
        Debug.Log("Player muerto");
        gameObject.SetActive(false);
    }

    void ResetColor()
    {
        CambiarColor(Color.white);
    }

    void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("Enemigo/Ataque"))
        {
            Debug.Log("Player: " + vidaActual);
            RecibeDaño(10);
        }

        if (collision.gameObject.CompareTag("Moneda"))
        {
            monedas++;
            string monedasActuales = monedas.ToString();
            monedasText.SetText(monedasActuales);
            Debug.Log("monedas: " + monedas);
        }
    }

    

}
