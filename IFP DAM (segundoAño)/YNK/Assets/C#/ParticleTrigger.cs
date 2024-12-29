using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ParticleTrigger : MonoBehaviour
{

    public ParticleSystem collisionParticleSystem;
    public SpriteRenderer sr;
    public bool unaVez = true;

    private void OnTriggerEnter2D(Collider2D collider)
    {
        if (collider.gameObject.CompareTag("Player") && unaVez)
        {
            Debug.Log("contacto");

            var em = collisionParticleSystem.emission;
            var mainModule = collisionParticleSystem.main;
            em.enabled = true;
            collisionParticleSystem.Play();
            unaVez = false;
            Destroy(sr);
            Invoke(nameof(DestroyObj), mainModule.duration);
        }
    }

    void DestroyObj()
    {
        Destroy(gameObject);
    }
}
