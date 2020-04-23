package com.udemy.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.Cliente;
import com.udemy.compras.ClienteInput;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ClienteService service;

    public Cliente cliente(Long id){
        return service.findById(id);
    }

    public List<Cliente> clientes(){
        return service.findAll();
    }

    public Cliente saveCliente(ClienteInput input){
        Cliente cliente = (new ModelMapper()).map(input, Cliente.class);
        return service.save(cliente);
    }

    public Boolean deleteCliente(Long id) {
        return service.deleteById(id);
    }
}
