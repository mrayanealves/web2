package br.ufrn.imd.rayserva.controller;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.rayserva.dominio.Reserva;
import br.ufrn.imd.rayserva.repositorio.ReservaRepositorio;

@Named
@SessionScoped
public class ReservaMBean {
	private Reserva reserva;
	
	private DataModel<Reserva> reservasModel;
	
	@Inject
	private UsuarioMBean usuarioMBean;
	
	@Inject
	private ReservaRepositorio reservaRepositorio;
	
	public String novaReserva() {
		reserva = new Reserva();
		return "/paginas/reserva/form.jsf";
	}	
	public String listarReservas() {
		reservasModel = new ListDataModel<Reserva> (reservaRepositorio.getReservas());
		return "/paginas/reserva/list.jsf";
	}
	public String listarReservasPorUsuario() {
		reservasModel = new ListDataModel<Reserva> (reservaRepositorio.buscarReservaPorUsuario(usuarioMBean.getUsuarioLogado().getLogin()));
		return "/paginas/reserva/list.jsf";
	}
	public String cadastrarMaterial() {
		reserva.setUsuario(usuarioMBean.getUsuarioLogado());
		reservaRepositorio.salvar(reserva);
		reserva = new Reserva();
		return "/paginas/reserva/form.jsf";
	}
	public String removerMaterial() {
		Reserva reservaRemovido = reservasModel.getRowData();
		reservaRepositorio.remover(reservaRemovido);
		return listarReservas();
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public DataModel<Reserva> getReservasModel() {
		return reservasModel;
	}

	public void setReservasModel(DataModel<Reserva> reservasModel) {
		this.reservasModel = reservasModel;
	}
}
