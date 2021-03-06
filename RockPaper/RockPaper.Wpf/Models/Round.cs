﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RockPaper.Wpf.Models
{
    public class Round
    {
        /// <summary>
        /// Gets or sets the identifier.
        /// </summary>
        /// <value>
        /// The identifier.
        /// </value>
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or sets the game identifier.
        /// </summary>
        /// <value>
        /// The game identifier.
        /// </value>
        public Guid GameId { get; set; }

        /// <summary>
        /// Gets or sets the team1 hand.
        /// </summary>
        /// <value>
        /// The team1 hand.
        /// </value>
        public string Team1Hand { get; set; }

        /// <summary>
        /// Gets or sets the team2 hand.
        /// </summary>
        /// <value>
        /// The team2 hand.
        /// </value>
        public string Team2Hand { get; set; }

        /// <summary>
        /// Gets or sets the result.
        /// </summary>
        /// <value>
        /// The result.
        /// </value>
        public string Result { get; set; }

        /// <summary>
        /// Gets or sets the sequence number.
        /// </summary>
        /// <value>
        /// The sequence number.
        /// </value>
        public int SequenceNumber { get; set; }
    }
}
