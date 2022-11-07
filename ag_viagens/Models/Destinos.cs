using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Recode_Api_2022.Models
{

    [Table("Destinos")]
    public class Destinos
    {
        [Key]
        public int DestinoId { get; set; }
        [Required(ErrorMessage = "Informe o nome do destino")]
        [StringLength(50)]
        public string Descricao { get; set; }
        [Required(ErrorMessage = "Informe o Preço")]
        public double Preço { get; set; }
    }
}
