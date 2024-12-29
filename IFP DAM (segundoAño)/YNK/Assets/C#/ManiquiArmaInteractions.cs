using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ManiquiArmaInteractions : MonoBehaviour
{
    private Rigidbody2D rb;
    private SpriteRenderer sR;
    private Animator anim;
    public Color colorDaño = Color.red;
    private Color color;
    public int vidaMax = 50;
    private int vidaActual;
    private bool muerto = false;
    private bool desaparecido = false;
    public bool recibeDaño = false;
    public bool atacando = false;
    //Si quiero sacar más de un objeto poner GameObject[] (array), si no solo GameObject
    public GameObject[] itemsDrop;
    public GameObject moneda;
    public float fuerzaVertical = 3;
    private bool itemDropped = false;

    void Start()
    {
        rb = GetComponent<Rigidbody2D>();
        sR = GetComponent<SpriteRenderer>();
        anim = GetComponent<Animator>();

        vidaActual = vidaMax;
        rb.isKinematic = true;
        moneda.SetActive(false);
    }

    void Update()
    {
        color = sR.color;
        anim.SetBool("muerto", muerto);
        anim.SetBool("desaparecido", desaparecido);
        anim.SetBool("recibeDaño", recibeDaño);
        anim.SetBool("atacando", atacando);
        if (color.a == 0.0f && !itemDropped)
        {
            ItemDrop();
            itemDropped = true;
            gameObject.SetActive(false);

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
        Debug.Log("Enemigo: " + vidaActual);

        recibeDaño = true;
        anim.SetBool("recibeDaño", true);
        atacando = true;
        anim.SetBool("atacando", true);

        if (vidaActual > 0)
        {
            vidaActual -= dañoRecibido;
            CambiarColor(colorDaño);

            if (vidaActual <= 0)
            {
                Muerte();
                Invoke("ResetColor", 0.2f);
            }
            else
            {
                Invoke("ResetColor", 0.2f);
            }
        }

        //recibeDaño se pone en false en la animación como propiedad en el último frame
    }

    void Muerte()
    {
        muerto = true;
        anim.SetBool("muerto", true);
        Muerto();
    }

    void Muerto()
    {
        desaparecido = true;
        anim.SetBool("desaparecido", true);

    }

    void ResetColor()
    {
        CambiarColor(Color.white);
    }

    void OnCollisionEnter2D(Collision2D collision)
    {
        //CAMBIAR EL TAG AL ARMA, ASI ESTÁ PILLANDO LA HITBOX DEL PLAYER
        //Esto es para cuando lo que contenga el tag "ataque" haga daño
        if (collision.gameObject.CompareTag("ataque") && !atacando)
        {
            RecibeDaño(10);

        //CUANDO HAYA ANIMACION DEL ARMA AÑADIR QUE SE ACTIVE LA ANIMACION DE ATACAR CUANDO HAYA CONTACTO
        //Pero que al chocarse no quite vida

        }
    }

    void OnTriggerEnter(Collider collider)
    {
        if (collider.gameObject.CompareTag("ataque") && !atacando)
        {
            RecibeDaño(10);
        }
    }

    private void ItemDrop()
    {
        moneda.SetActive(true);
        for (int i = 0; i < itemsDrop.Length; i++) 
        {
            Instantiate(itemsDrop[i], transform.position, Quaternion.identity);
        }
    }
}