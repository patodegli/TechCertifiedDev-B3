package bancolina;

import java.util.Date;

    public abstract class Tarjeta {
        private int nroFrente;
        private int codSeg;
        private Date fechaExpiracion;

        public Tarjeta(int nroFrente, int codSeg, Date fechaExpiracion) {
            this.nroFrente = nroFrente;
            this.codSeg = codSeg;
            this.fechaExpiracion = fechaExpiracion;
        }

        public int getNroFrente() {
            return nroFrente;
        }

        public int getCodSeg() {
            return codSeg;
        }

        public Date getFechaExpiracion() {
            return fechaExpiracion;
        }



}
