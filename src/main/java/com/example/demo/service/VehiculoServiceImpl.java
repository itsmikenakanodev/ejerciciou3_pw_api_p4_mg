package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.to.VehiculoTO;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public List<VehiculoTO> buscarTodos() {
		// TODO Auto-generated method stub
		List<Vehiculo> lista = this.iVehiculoRepository.buscarTodos();
		List<VehiculoTO> ls = new ArrayList<>();
		for (Vehiculo vehiculo : lista) {
			ls.add(this.convertir(vehiculo));
		}
		return ls;
	}

	@Override
	public VehiculoTO buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.convertir(this.iVehiculoRepository.buscarPorPlaca(placa));
	}
	
	private VehiculoTO convertir(Vehiculo vehiculo) {
		VehiculoTO vehi=new VehiculoTO(vehiculo.getId(), vehiculo.getPlaca(), vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getCapacidad());
		return vehi;
	}
	
}
