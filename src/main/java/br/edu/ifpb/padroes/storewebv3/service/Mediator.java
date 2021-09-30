package br.edu.ifpb.padroes.storewebv3.service;

public interface Mediator {
    void notification(MediatedService service, MediatorEvents event);
}
