using Microsoft.EntityFrameworkCore;

namespace Recode_Api_2022.Models
{
    public class DestinosDbContext: DbContext
    {
        public DestinosDbContext(DbContextOptions<DestinosDbContext> options)
          : base(options)
        { }
        public DbSet<Destinos> Destinos { get; set; }

    }
}


